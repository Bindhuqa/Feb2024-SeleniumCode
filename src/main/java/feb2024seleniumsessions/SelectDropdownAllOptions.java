package feb2024seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownAllOptions {
   static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");
		By country = By.id("Form_getForm_Country");
	    By employee = By.id("Form_getForm_NoOfEmployees");
		
//		Select select_country = new Select(driver.findElement(country));
//		List<WebElement>  countrylist = select_country .getOptions();
//		System.out.println(countrylist.size());
//		for(WebElement e:countrylist) {
//			String text = e.getText();
//			System.out.println(text);
//		}
	    
	   List<String> employeelist = getDropdownOptionsTextList(employee);
	   System.out.println(employeelist);
	   List<String> countrylist = getDropdownOptionsTextList(country);
	   System.out.println(countrylist);
	   
	  System.out.println(getDropdownOptionsCount(country));
		
	}
	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);
	}
	
	public static int  getDropdownOptionsCount(By Locator) {
		Select select = new Select(getElement(Locator));
		return select.getOptions().size();
		
	}
	
	public static List<String> getDropdownOptionsTextList(By Locator) {
		Select select = new Select(getElement(Locator));
		List<WebElement>  optionslist = select.getOptions();
		List<String> optionstextlist = new ArrayList<String>();
		System.out.println(optionslist.size());
		for(WebElement e:optionslist) {
			String text = e.getText();
			 optionstextlist .add(text);
			
		}
		return optionstextlist;
	}

}
