package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("trainee");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.name("pwd")).sendKeys("trainee");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
	 if(title.equals("actiTIME - Login"))
	 {
		 System.out.println("Pass: Home page is displayed");
	 }
	 else
	 {
		 System.out.println("Fail: Home page is not displayed");
	 }
		
   driver.close();
	}

}

