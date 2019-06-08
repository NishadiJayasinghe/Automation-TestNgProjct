package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage extends Base {
	
	public static WebElement textbox_search(){
		
		WebElement textBox =  getDriver().findElement(By.name("q"));
		return textBox;
	}
	
	
	public static WebElement button_search(){
		
		WebElement submitbtn = getDriver().findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]"));
		return submitbtn;
		
	}
	
}
