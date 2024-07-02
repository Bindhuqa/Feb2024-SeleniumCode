package feb2024seleniumsessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluenrWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		// default polling time is 500ms

		By pricinglink = By.linkText("Pricing");

		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
//				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class)
//				.withMessage("====Element is not found====");
//
//		wait.until(ExpectedConditions.visibilityOfElementLocated(pricinglink)).click();
		
		 waitForElementVisibleWithFluentWait(pricinglink,10,2);

	}

	public static WebElement waitForElementVisibleWithFluentWait(By Locator, int timeout, int intervaltime) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofSeconds(intervaltime)).ignoring(NoSuchElementException.class)
				.withMessage("====Element is not found====");

		return wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));

	}
	
	public static WebElement waitForElementPresenceWithFluentWait(By Locator, int timeout, int intervaltime) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofSeconds(intervaltime)).ignoring(NoSuchElementException.class)
				.withMessage("====Element is not found====");

		return wait.until(ExpectedConditions.presenceOfElementLocated(Locator));

	}

}
