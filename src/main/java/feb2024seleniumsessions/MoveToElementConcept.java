package feb2024seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		// driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
//		Actions act = new Actions(driver);
//		act.moveToElement(driver.findElement(By.cssSelector(".menulink"))).perform();
//		act.moveToElement(driver.findElement(By.linkText("COURSES"))).click().perform();
		driver.get("https://www.spicejet.com/");
		// By parentlocator = By.cssSelector(".menulink");
		// By childlocator = By.linkText("COURSES");
		By parentlocator = By.xpath("//div[text()='Add-ons']");
		By childlocator = By.xpath("//div[text()='Extra Seat']");
		handleParentSubMenu(parentlocator, childlocator);

	}

	public static void handleParentSubMenu(By parentlocator, By childlocator) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(parentlocator)).perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(childlocator)).click().perform();

	}

}
