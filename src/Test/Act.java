package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class Act {

	public String baseURL = "http://demo.guru99.com/insurance/v1/index.php";
	public WebDriver driver;
	
	@BeforeTest
	public void LaunchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/insurance/v1/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
		
	}
	
	@Test
	public void action() {
		
		WebElement selenium = driver.findElement(By.linkText("Selenium"));
		Actions act = new Actions(driver);
		act.moveToElement(selenium).perform();
		selenium.click();
		
		WebElement yahoo = driver.findElement(By.linkText("Yahoo"));
		act.moveToElement(yahoo).perform();
		yahoo.click();
	}
	
	@AfterTest
	public void terminateBrowser() {
		
		driver.quit();
		
	}
}
