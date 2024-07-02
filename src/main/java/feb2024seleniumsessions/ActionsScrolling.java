package feb2024seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Actions act = new Actions(driver);
//		act.sendKeys(Keys.PAGE_DOWN).perform();//slightly comes down
//		Thread.sleep(3000);
//		act.sendKeys(Keys.PAGE_UP).perform();//slightly comes up
		
		
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();//for complete down
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).perform();//for complete up
		
		//scroll to element concept
		
		act.scrollToElement(driver.findElement(By.linkText("Myntra")))
		         .click(driver.findElement(By.linkText("Myntra"))).perform();
		
	
	}

}
