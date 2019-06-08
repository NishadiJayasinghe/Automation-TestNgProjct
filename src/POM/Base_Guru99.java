package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Guru99 {

	public static String baseURL = "http://demo.guru99.com/insurance/v1/index.php\r\n";
	public static WebDriver driver;
	
	public static void openURL() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		  driver.get(baseURL);
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, "TimeUnit.SECONDS");
		
	}
	
	public static WebDriver getDriver() {
		
		return driver;
	
	}
	
}
