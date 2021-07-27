package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	
	WebElement block1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
	WebElement block3 = driver.findElement(By.xpath("//h1[text()='Block 3']"));
	Thread.sleep(2000);
	Actions a=new Actions(driver);
	a.dragAndDrop(block3, block1).perform();
	Thread.sleep(2000);
	driver.close();
	}

}
