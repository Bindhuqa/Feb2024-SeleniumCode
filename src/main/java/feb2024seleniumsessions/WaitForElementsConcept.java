package feb2024seleniumsessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElementsConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		By toplinks = By.xpath("//ul[@class='nav navbar-nav navbar-right']/li/a");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		List<WebElement> toplist = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(toplinks));
		System.out.println(toplist.size());
//	for(WebElement e:toplist) {
//		e.getText();
//	}

	}

	/**
	 * An expectation for checking that there is at least one element present on a
	 * web page.
	 * 
	 * @param Locator
	 * @param timeout
	 * @return
	 */
	public static List<WebElement> waitForPresenceOfElementsLocated(By Locator, int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(Locator));

	}

	/**
	 * An expectation for checking that all elements present on the web page that
	 * match the locatorare visible. Visibility means that the elements are not only
	 * displayed but also have a heightand width that is greater than 0.
	 * 
	 * @param Locator
	 * @param timeout
	 * @return
	 */
	public static List<WebElement> waitForPVisibilityOfElementsLocated(By Locator, int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Locator));

	}

}
