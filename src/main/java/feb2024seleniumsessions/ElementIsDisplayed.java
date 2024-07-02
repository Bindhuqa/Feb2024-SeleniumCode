package feb2024seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		boolean flag = driver.findElement(By.id("input-email")).isDisplayed();
//		System.out.println(flag);

		By emailid = By.id("input-email");
		By imgLogo = By.className("img-responsive");
		By frgtpwd = By.linkText("Forgotten Password");

//		if (doIsDisplayed(emailid)) {
//			System.out.println("pass");
//		} else {
//			System.out.println("fail");
//		}
//
//		List<WebElement> emailidList = driver.findElements(emailid);
//		if (emailidList.size() == 1) {
//			System.out.println("Email id is present once in the page");
//		} else {
//			System.out.println("Email id is present more than once in the page");
//		}
		
		System.out.println(isElementDisplayed(imgLogo));
		isElementDisplayed(frgtpwd, 2);

	}

	public static boolean isElementDisplayed(By Locator) {
		int elementcount = driver.findElements(Locator).size();
		if (elementcount == 1) {
			System.out.println("single element is displayed on the page");
			return true;
		} else {
			System.out.println("multiple or no elements are displayed on the page");
			return false;

		}
	}
	
	public static boolean isElementDisplayed(By Locator,int expectedElementCount) {
		int elementcount = driver.findElements(Locator).size();
		if (elementcount == expectedElementCount) {
			System.out.println("Element is displayed "+ Locator + " with occurence of "+ expectedElementCount);
			return true;
		} else {
			System.out.println("multiple or no elements are displayed on the page with the occurence of " + expectedElementCount);
			return false;

		}
	}


	public static boolean doIsDisplayed(By Locator) {
		try {
			boolean flag = getElement(Locator).isDisplayed();
			System.out.println("Element is displayed " + Locator);
			return flag;
		} catch (NoSuchElementException e) {
			System.out.println("Element with locator " + Locator + "is not displayed");
			return false;

		}

	}

	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);
	}

}
