package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("LOGIN")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("user");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("user");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Harry Den']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[a='Profile']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='btn btn-success btn-flat btn-sm']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.name("firstname"));
		ele.clear();
		Thread.sleep(2000);
		driver.findElement(By.name("edit")).submit();
		
		
		
	}

}
