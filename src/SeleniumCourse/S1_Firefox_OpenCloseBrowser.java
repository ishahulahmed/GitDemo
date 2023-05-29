package SeleniumCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class S1_Firefox_OpenCloseBrowser {

	public static void main(String[] args)throws InterruptedException  {
		
		// To open firefox browser, navigate to application and close firefox browser
		//FirefoxDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.gecko.marionette","./Drivers/geckodriver.exe");// u can use "//" also
		
		WebDriver driver=new FirefoxDriver();
		//https://demo.actitime.com/login.do
		driver.get("https://demo.actitime.com/login.do"); 
		//use the above URL insted of below url
		//driver.get("http://localhost:8080/login.do");
		Thread.sleep(3000);
		driver.close();
		//driver.quit();
		
		
		

	}

}
