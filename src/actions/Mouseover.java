package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.myntra.com/");
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			WebElement ele = driver.findElement(By.xpath("//a[text()='Women']"));
			Thread.sleep(2000);
			
			Actions a=new Actions(driver);
			Thread.sleep(2000);
			a.moveToElement(ele).perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Skirts & Palazzos']")).click();;
			Thread.sleep(2000);
			
			driver.close();
	}

}
