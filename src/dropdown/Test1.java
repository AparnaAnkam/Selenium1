package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		WebElement ele = driver.findElement(By.id("cars"));
		
		Select s=new Select(ele);
		s.selectByIndex(2);
		s.selectByValue("299");
		//s.selectByVisibleText("Free ( 90 ) ");
		
		System.out.println(s.isMultiple());
		
		if(s.isMultiple()){
			Thread.sleep(2000);
			s.deselectByIndex(2);
			Thread.sleep(2000);
			s.deselectByValue("299");
			Thread.sleep(2000);
			//s.deselectByVisibleText("Free ( 90 ) ");
			s.deselectAll();
			
			List<WebElement> allOptions = s.getOptions();
			 System.out.println(allOptions.size());
			 
			 for(WebElement b:allOptions)
			 {
				 System.out.println(b.getText());
			 }
			 
		}
		
		Thread.sleep(2000);
		driver.close();
	}

}