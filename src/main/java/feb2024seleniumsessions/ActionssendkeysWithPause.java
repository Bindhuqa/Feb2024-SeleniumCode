package feb2024seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionssendkeysWithPause {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By searchfield = By.name("search");
		// String searchkey = "Samsung";
//		Actions act = new Actions(driver);
//		char ch[] = searchkey.toCharArray();
//		for(char e:ch) {
//			act.sendKeys(driver.findElement(searchfield),String.valueOf(e)).pause(500).perform();
//			
//			
//			
//	
//		}

		doActionSendkeysWithPause(searchfield, "Samsung", 500);

	}

	public static void doActionSendkeysWithPause(By Locator,String value,long pausetime) {
		Actions act = new Actions(driver);
		char ch[] = value.toCharArray();
		for(char e:ch) {
			act.sendKeys(driver.findElement(Locator),String.valueOf(e)).pause(pausetime).perform();
			
		}
	}

	public static void doActionSendkeysWithPause(By Locator, String value) {
		Actions act = new Actions(driver);
		char ch[] = value.toCharArray();
		for (char e : ch) {
			act.sendKeys(driver.findElement(Locator), String.valueOf(e)).pause(500).perform();

		}

	}

}
