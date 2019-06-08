package Guru99;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.Base_Guru99;
import POM.Guru99_POM;


public class Guru99 extends Base_Guru99{
	
	/*Guru99_POM lt = new Guru99_POM();
	 WebElement parameter1 = lt.Title();
	 String parameter2 = "Miss";*/
	
	
	
	@BeforeTest
	public void launchDriver() {
		
		openURL();
		
	}
	
//	private Guru99_POM lt;
//    @BeforeMethod
//    public void beforeMethod(){
//        lt = new Guru99_POM();
//     }
	
	@Test(priority = 0)
	public void register() {
	
	Guru99_POM.register().click();
		
	}
	
	 //WebElement parameter1 = lt.Title();
	
	@Test(priority = 1)
	public void title() {

	/*Select selectValue = new Select(parameter1);
	selectValue.selectByVisibleText(parameter2);*/

	Select selectValue = new Select(Guru99_POM.Title());
	selectValue.selectByVisibleText("Miss");	
		
	}
	
	@Test(priority = 2)
	public void FirstName() {
	
	Guru99_POM.firstName().sendKeys("Nishadi");
		
	}
	
	@Test(priority = 3)
	public void surName() {
		
	Guru99_POM.surName().sendKeys("jayasinghe");
			
	}
	
	@Test(priority = 4)
	public void year() {
		
		Select selectValue = new Select(Guru99_POM.year());
		selectValue.selectByVisibleText("1994");	
			
	}
	
	@Test(priority = 5)
	public void month() {
		
		Select selectValue = new Select(Guru99_POM.month());
		selectValue.selectByIndex(6);	
			
	}
	
	@Test(priority = 6)
	public void day() {
		
		Select selectValue = new Select(Guru99_POM.day());
		selectValue.selectByIndex(6);	
			
	}
	
	@Test(priority = 7)
	public void radiBTN() {
		
		Guru99_POM.RadioBtn().click();
			
	}
	
	@Test(priority = 8)
	public void create() {
		
		Guru99_POM.create().click();
			
	}
	
	@Test(priority = 9)
	public void selenium() {
		
		Actions act = new Actions(getDriver());
		act.moveToElement(Guru99_POM.selenium()).perform();
		act.click();
			
	}
	
	@Test(priority = 10)
	public void yahoo() {
		
		Actions act = new Actions(getDriver());
		act.moveToElement(Guru99_POM.yahoo()).perform();
		act.click();
			
	}
	
	@AfterTest
	public void TerminateDriver() {
		
		driver.quit();
		
	}
	
}
