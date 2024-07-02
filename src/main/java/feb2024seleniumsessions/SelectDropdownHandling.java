package feb2024seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownHandling {
   static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");
		//html tag=select
		//select class in selenium
		
		By country = By.id("Form_getForm_Country");
		By employee = By.id("Form_getForm_NoOfEmployees");
		
//		Select select_country = new Select(driver.findElement(country));
//		select_country.selectByIndex(5);
//		select_country.selectByValue("Austria");
//		select_country.selectByVisibleText("Canada");
//		
//		Select select_employee = new Select(driver.findElement(employee));
//		 select_employee.selectByIndex(7);
//		 select_employee.selectByVisibleText("151 - 200");
        
		doSelectByVisibleText(country,"Brazil");
		doSelectByIndex(employee,10);
		

	}
	
	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);
	}
	public static void doSelectByIndex(By Locator,int index) {
		Select select = new Select(getElement(Locator));
		select.selectByIndex(index);
	}
	public static void doSelectByValue(By Locator,String value) {
		Select select = new Select(getElement(Locator));
		select.selectByValue(value);;
	}
	public static void doSelectByVisibleText(By Locator,String Visibletext) {
		Select select = new Select(getElement(Locator));
		select.selectByVisibleText(Visibletext);
	}

}
