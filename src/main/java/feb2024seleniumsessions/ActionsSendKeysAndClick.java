package feb2024seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeysAndClick {
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By firstname = By.id("input-firstname");
		
		Actions act = new Actions(driver);
		act.sendKeys(driver.findElement(firstname), "naveen").perform();
		
		act.click(driver.findElement(By.linkText("Wish List"))).perform();
		
		
		

	}
	
	public static void doActionsSendkeys(By Locator,String value) {
		Actions act = new Actions(driver);
		act.sendKeys(driver.findElement(Locator), value).perform();
		
	}
	
	public static void doActionsClick(By Locator) {
		Actions act = new Actions(driver);
		act.click(driver.findElement(Locator)).perform();
		
	}

}
