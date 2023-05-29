package SeleniumCourse;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.firefox.marionette", "D:\\6.SELENIUM WEB DRIVERS/geckodriver");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://demo.guru99.com/test/newtours/");

	}

}
