package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Guru99_POM extends Base_Guru99{
	
	
	public static WebElement register() {
		
		WebElement register = getDriver().findElement(By.xpath("//div[3]/a"));
		return register;
		
	}
	
	public static WebElement Title() {
		
		WebElement Title = getDriver().findElement(By.xpath("//*[@id=\"user_title\"]"));
		return Title;
		
		
		
	}
	
	public static WebElement firstName() {
		
		WebElement firstName = getDriver().findElement(By.xpath("//input[@id=\"user_firstname\"]"));
		return firstName;
		
	}
	
	public static WebElement surName() {
		
		WebElement surName = getDriver().findElement(By.xpath("//input[@id='user_surname']"));
		return surName;
		
	}
	
	public static WebElement phone() {
		
		WebElement phone = getDriver().findElement(By.xpath("//input[@id='user_phone']"));
		return phone;
		
	}
	
	public static WebElement year() {
		
		WebElement year = getDriver().findElement(By.xpath("//select[@id='user_dateofbirth_1i']"));
		return year;
	}
		
   public static WebElement month() {
	   
		WebElement month = getDriver().findElement(By.xpath("//select[@id='user_dateofbirth_2i']"));
		return month;
    }
	
   public static WebElement day() {
	   
		WebElement day = getDriver().findElement(By.xpath("//select[@id='user_dateofbirth_3i']"));
		return day;
		
	}
   public static WebElement RadioBtn() {
	   
	   WebElement radioBTN = getDriver().findElement(By.xpath("//input[@id='licencetype_t']"));
	   return radioBTN;
   }
   
   public static WebElement create() {
	   
	   WebElement create = getDriver().findElement(By.xpath("//input[@name='submit']"));
	   return create;
   }
   
   public static WebElement selenium() {
		
		WebElement selenium = getDriver().findElement(By.linkText("Selenium"));
	     return selenium;
   }
   
   public static WebElement yahoo() {
		
	   WebElement Yahoo = driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[8]/a"));
	     return Yahoo;
  }
   
}
