package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.skillrary.com/user/login");
		driver.findElement(By.id("email")).sendKeys("gaddamaparna96@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Yadnyaja");
		driver.findElement(By.name("submit")).click();
}
}