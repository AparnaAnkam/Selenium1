package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		 WebElement ele = driver.findElement(By.name("url"));
		 
		 Select s=new Select(ele);
		 Thread.sleep(3000);
		 s.selectByIndex(2);
		 Thread.sleep(3000);
		 s.selectByValue("search-alias=electronics-intl-ship");
		 Thread.sleep(3000);
		 s.selectByVisibleText("Industrial & Scientific");
		 Thread.sleep(3000);
		 List<WebElement> allOptions = s.getOptions();
		 System.out.println(allOptions.size());
		 
		 for(WebElement b:allOptions)
		 {
			 System.out.println(b.getText());
		 }
		driver.close();

	}

}
