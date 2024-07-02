package feb2024seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		// 1
		// driver.findElement(By.id("input-email")).sendKeys("bindhu24@gmail.com");
		// driver.findElement(By.id("input-password")).sendKeys("bindhu@123");

//		//2
//		WebElement email =driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		
//		email.sendKeys("bindhu24@gmail.com");
//		password.sendKeys("bindhu@123");
//		
		// 3.by locator

//		By emailid = By.id("input-email");
//		By password = By.id("input-password");
//		
//		WebElement email_ele =driver.findElement(emailid);
//		WebElement password_ele = driver.findElement(password);
//		
//		email_ele.sendKeys("bindhu24@gmail.com");
//		password_ele.sendKeys("bindhu@123");

		// 4.by locator+generic function for WebElement

//		By emailid = By.id("input-email");
//		By password = By.id("input-password");
//		getElement(emailid).sendKeys("bindhu24@gmail.com");
//		getElement(password).sendKeys("bindhu@123");

		// 5.by locator +generic function of webelement and sendkeys method
//		By emailid = By.id("input-email");
//		By password = By.id("input-password");
//
//		doSendkeys(emailid, "bindhu24@gmail.com");
//		doSendkeys(password, "bindhu@123");

//		6.by locator+generic funtion for element and sendkeys in ElementUtil class
		
		By emailid = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil eu = new ElementUtil(driver);
		eu.doSendkeys(emailid, "bindhu24@gmail.com");
		eu.doSendkeys(password, "bindhu@123");
		
		//7.ny locator+browserutil+elemetutil
	}

	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);
	}

	public static void doSendkeys(By Locator, String value) {
		getElement(Locator).sendKeys(value);
	}

}
