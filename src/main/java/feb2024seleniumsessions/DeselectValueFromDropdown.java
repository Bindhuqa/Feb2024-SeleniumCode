package feb2024seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectValueFromDropdown {
   static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
	//multiple attributes should be there with the select tag
//		Select select = new Select((driver.findElement(By.xpath("//*[@id=\"post-291\"]/div/div[2]/select"))));
//        System.out.println(select.isMultiple());
//        
//        if(select.isMultiple()) {
//         select.selectByVisibleText("Chilean flamingo");
//         select.selectByVisibleText("American flamingo");
//         select.selectByValue("Lesser");
//         
//         
//        }
//        
//        select.deselectByVisibleText("American flamingo");
//        select.deselectAll();
		
		By multipledropdown = By.xpath("//*[@id=\"post-291\"]/div/div[2]/select"); 
		ElementUtil eu = new ElementUtil(driver);
		eu.doSelectByVisibleText(multipledropdown, "American flamingo");
		eu.doSelectByValue(multipledropdown, "Chilean");
		doDeselectByVisibleText(multipledropdown,"American flamingo");
		doDeselectAll(multipledropdown);
	}
	

	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);
	}
	
	public static void doDeselectAll(By Locator) {
		Select select = new Select(getElement(Locator));
		select.deselectAll();
	}
	
	public static void doDeselectByVisibleText(By Locator,String text) {
		Select select = new Select(getElement(Locator));
		select.deselectByVisibleText(text);
	}
	
	public static void doDeselectByValue(By Locator,String value) {
		Select select = new Select(getElement(Locator));
		select.deselectByValue(value);
	}
	
	public static void doDeselectByIndex(By Locator,int index) {
		Select select = new Select(getElement(Locator));
		select.deselectByIndex(index);
	}


}
