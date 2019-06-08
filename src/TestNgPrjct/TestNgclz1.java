package TestNgPrjct;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgclz1 {
    
 public String baseUrl = "http://newtours.demoaut.com/";
 public static WebDriver driver;
 
 //driver d = new driver();

 @BeforeTest
 public void launchBrowser() {
	 System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver_win32\\chromedriver.exe");
	 //WebDriver driver = new ChromeDriver();
	 driver = new ChromeDriver();
     driver.get(baseUrl); 
      //getdriver() > driver
 };

 @Test
 public void verifyHomepageTitle() {
     String expectedTitle = "welcome: Mercury Tours";
     String actualTitle = driver.getTitle();
     Assert.assertEquals(actualTitle,  expectedTitle);
 };

 @AfterTest
 public void terminateBrowser() {
      driver.quit();
 };
}
