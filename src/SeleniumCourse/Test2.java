package SeleniumCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		// To open chrome browser, navigate to application and close chrome browser
		System.setProperty("webdriver.chrome.marionette", "D:\\6.SELENIUM WEB DRIVERS/chromedriver");// u can use "//" also
		// Open the browser
		// ChromeDriver driver=new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		// driver.navigate().to("https://demo.actitime.com/login.do");
		//Thread.sleep(2000);

		String title = driver.getTitle();
		System.out.println(title);

		String url = driver.getCurrentUrl();
		System.out.println(url);
		//Thread.sleep(2000);
		// driver.close();
		driver.quit();
	}

}
