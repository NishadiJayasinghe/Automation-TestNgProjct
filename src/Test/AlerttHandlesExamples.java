package Test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlerttHandlesExamples {

	@Test 
	public void handleAlert() {
		System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("http://jsbin.com/usidix/1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/input")).click();
		System.out.println("Alert Text message = " + driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.quit();
		
	}
	
}
