package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("gaddamaparna96@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("xzcfsvdfvbdb");
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.name("email")).sendKeys("3251154210");
		//driver.findElement(By.name("submit")).click();
		
		
	}

}
