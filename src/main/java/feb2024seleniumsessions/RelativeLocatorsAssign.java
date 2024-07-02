package feb2024seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;

public class RelativeLocatorsAssign {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.findElement(By.xpath("(//input[@name='newsletter'])[1]"));
		

	}

}
