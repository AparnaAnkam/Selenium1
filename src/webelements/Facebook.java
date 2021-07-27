package webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.name("firstname"));
		Thread.sleep(3000);
		if(ele.isDisplayed()) {
			System.out.println("Firstname textfield is dislayed");
		}
		else
		{
			System.out.println("Firstname textfield is not dispalyed");
		}
	
		WebElement btn = driver.findElement(By.name("websubmit"));
		if(btn.isEnabled()) {
			System.out.println("SignUp button is enabled");
		}
		else
		{
			System.out.println("SignUp button is not enabled");
		}
		
		WebElement ch = driver.findElement(By.name("sex"));
		if(ch.isSelected()) {
			System.out.println("Radio button is selected");
		}
		else
		{
			System.out.println("Radio button is not selected");
		}
		
		driver.close();
		
	}
}
