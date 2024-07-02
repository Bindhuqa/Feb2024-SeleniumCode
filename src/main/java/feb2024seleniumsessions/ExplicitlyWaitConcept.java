package feb2024seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By emailid = By.id("input-email");
		By password = By.id("input-password");
		By login = By.xpath("//input[@type='submit']");

//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//	WebElement email_ele =	wait.until(ExpectedConditions.presenceOfElementLocated(emailid));
//	email_ele.sendKeys("bindhu@gmail.com");
//	
//	getElement(password).sendKeys("bindhu");
//	getElement(login).click();

		WaitForElementPresence(emailid, 10).sendKeys("bindhu@gmail.com");
		getElement(password).sendKeys("bindhu");
		doClickWithWait(login,5);
		

	}

	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);
	}

	/**
	 * An expectation for checking that an element is present on the DOM of a page.
	 * This does not necessarily mean that the element is visible.
	 * 
	 * @param Locator
	 * @param timeout
	 * @return
	 */
	public static WebElement WaitForElementPresence(By Locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(Locator));

	}

	/**
	 * An expectation for checking that an element is present on the DOM of a page
	 * and visible. Visibility means that the element is not only displayed but also
	 * has a height and width that is greater than 0.
	 * 
	 * @param Locator
	 * @param timeout
	 * @return
	 */
	public static WebElement WaitForElementVisible(By Locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));

	}
   public static void doClickWithWait(By Locator,int timeout) {
	   WaitForElementVisible(Locator,timeout).click(); 
   }
}
