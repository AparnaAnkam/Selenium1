package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/nlogin/login");
		driver.findElement(By.id("usernameField")).sendKeys("gaddamaparna96@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("212154232465");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
	 if(title.equals("Jobseeker's Login: Search the Best Jobs available in India & Abroad - Naukri.com"))
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

