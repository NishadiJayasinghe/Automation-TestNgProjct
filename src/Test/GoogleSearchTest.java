package Test;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.Base;
import POM.GoogleSearchPage;


public class GoogleSearchTest extends Base{
	
	private static final long TimeOut = 20;

	@BeforeTest
	public void launchDriver() {
		openURL();
		
	};
	
	@Test(priority =0)
	public void googleSearch() throws InterruptedException {
		
		GoogleSearchPage.textbox_search().sendKeys("TestNG automation");
		driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
		Thread.sleep(3000);
	}; 
	
	
	
public void googleSearchClick() throws InterruptedException {
		
		GoogleSearchPage.button_search().click(); 
		
		Thread.sleep(3000);
		
	}; 
	
	//@Test(priority =1)	
	
	
	@AfterTest
	
	public void terminateBrowser() {
		
		driver.quit();
		
		System.out.println("Automation process succeeded");
		
	};
	
}
