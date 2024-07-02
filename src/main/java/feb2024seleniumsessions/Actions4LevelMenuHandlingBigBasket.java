package feb2024seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions4LevelMenuHandlingBigBasket {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		By Level1 = By.xpath("(//button[contains(@id,'headlessui-menu-button')]//span[text()='Shop by'])[2]");
		By Level2 = By.linkText("Bakery, Cakes & Dairy");
		By Level3 = By.linkText("Cakes & Pastries");
		By Level4 = By.linkText("Muffins & Cup Cakes");

//		driver.findElement(level1).click();
//		Thread.sleep(1000);
//		
//		Actions act = new Actions(driver);
//		act.moveToElement(driver.findElement(level2)).perform();
//		Thread.sleep(1000);
//		act.moveToElement(driver.findElement(level3)).perform();
//		Thread.sleep(1000);
//		driver.findElement(level4).click();
//		

		// level4MenuSubMenuHandling(level1,level2,level3,level4);
		//level4MenuSubMenuHandlingUsingClick("Shop by","Bakery, Cakes & Dairy","Cakes & Pastries","Muffins & Cup Cakes");
		level4MenuSubMenuHandlingUsingClick(Level1,"Beverages","Water","Spring Water");

	}

	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);
	}

	public static void level4MenuSubMenuHandlingUsingClick(By Level1, String Level2, String Level3, String Level4)
			throws InterruptedException {
		getElement(Level1).click();
		Thread.sleep(1000);

		Actions act = new Actions(driver);
		act.moveToElement(getElement(By.linkText(Level2))).perform();
		Thread.sleep(1000);
		act.moveToElement(getElement(By.linkText(Level3))).perform();
		Thread.sleep(1000);
		getElement(By.linkText(Level4)).click();


	}

	public static void level4MenuSubMenuHandlingUsingClick(By Level1, By Level2, By Level3, By Level4)
			throws InterruptedException {
		getElement(Level1).click();
		Thread.sleep(1000);

		Actions act = new Actions(driver);
		act.moveToElement(getElement(Level2)).perform();
		Thread.sleep(1000);
		act.moveToElement(getElement(Level3)).perform();
		Thread.sleep(1000);
		getElement(Level4).click();

	}

	public static void level4MenuSubMenuHandlingUsingMouseHover(By Level1, By Level2, By Level3, By Level4)
			throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(Level1)).perform();

		Thread.sleep(1000);
		act.moveToElement(getElement(Level2)).perform();
		Thread.sleep(1000);
		act.moveToElement(getElement(Level3)).perform();
		Thread.sleep(1000);
		getElement(Level4).click();

	}

}
