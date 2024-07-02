package feb2024seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdowngetOptionsWithoutSelectClass {
	static WebDriver driver;

	public static void main(String[] args) {

		// select a value from dropdown without using select methods like by
		// value,index,visible text
		// select a value from dropdown without using the select class

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");

		By country = By.id("Form_getForm_Country");
		By employee = By.id("Form_getForm_NoOfEmployees");
		By countryoptions = By.xpath("//select[@id='Form_getForm_Country']/option");
		
//		Select select_country = new Select(driver.findElement(country));
//		 List<WebElement> country_options = select_country.getOptions();
//		 for(WebElement e:country_options) {
//			String text = e.getText();
//			if(text.equals("Canada")) {
//				e.click();
//				break;
//			}
//		 }
		selectValueFromDropdown(country,"Australia");
//		
//		List<WebElement> countrylist = driver.findElements(countryoptions);
//		System.out.println( countrylist.size());
//		for(WebElement e:countrylist) {
//			String text = e.getText();
//			if(text.equals("India")) {
//				e.click();
//				break;
//			}
//		}
		
		selectValueFromDropdownWithoutSelectClass(countryoptions,"Switzerland");
		

	}
	
	
	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);
	}
	
	public static void selectValueFromDropdown(By Locator,String value) {
		Select select = new Select(driver.findElement(Locator));
		 List<WebElement> options = select.getOptions();
		 for(WebElement e:options) {
			String text = e.getText();
			if(text.equals(value)) {
				e.click();
				break;
			}
		 }
		
	}
	
	public static void selectValueFromDropdownWithoutSelectClass(By Locator,String value) {
		List<WebElement> optionslist = driver.findElements(Locator);
		System.out.println( optionslist.size());
		for(WebElement e:optionslist) {
			String text = e.getText();
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
	}

}
