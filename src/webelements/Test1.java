package webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.id("headerContainer"));
        System.out.println(ele.getText());
        Thread.sleep(3000);
		
		WebElement ele1 = driver.findElement(By.name("username"));
        
		Dimension s = ele1.getSize();
		System.out.println("Height-"+s.height);
		System.out.println("Width-"+s.width);
		
		WebElement ele2 = driver.findElement(By.name("pwd"));
        
		Point loc = ele2.getLocation();
		System.out.println("x coordinates-"+loc.getX());
		System.out.println("y coordinates-"+loc.getY());
		
		driver.close();
	}

}
