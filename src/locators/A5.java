package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/account/login?hl=en_US&service=my&co=US&continue=https%3A%2F%2Fwww.indeed.com%2F");
		driver.findElement(By.name("__email")).sendKeys("gaddamaparna96@gmail.com");
		driver.findElement(By.name("__password")).sendKeys("212154232465");
		driver.findElement(By.name("login-submit-button")).click();
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

