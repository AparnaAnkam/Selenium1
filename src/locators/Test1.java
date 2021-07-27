package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("gaddamaparna96@gmail.com");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("afdsgfdgdfbdb");
	}

}
