package feb2024seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleAndUrl {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		By pricinglink = By.linkText("Pricing");

		ElementUtil eleutil = new ElementUtil(driver);
		eleutil.clickWhenReady(pricinglink, 10);

		

//		String title = waitForTitleContains("PRICING11", 10);
//		System.out.println(title);
//		System.out.println(title.contains("PRICING"));
		
	String url = waitForUrlContains("pricing.html",5);
	System.out.println(url);

	}
	
	
	public static String waitForUrlContains(String urlfraction, int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
			if (wait.until(ExpectedConditions.urlContains(urlfraction))) {
				return driver.getCurrentUrl();
			}
		} catch (TimeoutException e) {
			System.out.println("url not found");

		}
		return driver.getCurrentUrl();

	}
	
	public static String waitForUrlToBe(String url, int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
			if (wait.until(ExpectedConditions.urlToBe(url))) {
				return driver.getCurrentUrl();
			}
		} catch (TimeoutException e) {
			System.out.println("url not found");

		}
		return driver.getCurrentUrl();

	}
	

	public static String waitForTitleContains(String titlefraction, int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
			if (wait.until(ExpectedConditions.titleContains(titlefraction))) {
				return driver.getTitle();
			}
		} catch (TimeoutException e) {
			System.out.println("title not found");

		}
		return driver.getTitle();

	}
	
	public static String waitForTitleToBe(String title, int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
			if (wait.until(ExpectedConditions.titleIs(title))) {
				return driver.getTitle();
			}
		} catch (TimeoutException e) {
			System.out.println("title not found");

		}
		return driver.getTitle();

	}
	
	


}
