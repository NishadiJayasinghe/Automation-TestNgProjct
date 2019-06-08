package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static String baseURl = "http://google.com";
	public static WebDriver driver ;
	
	public static void openURL() {
		System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseURl);
		driver.manage().window().maximize();
	}
	
	public static WebDriver getDriver() {
		return driver;	
	}
}
