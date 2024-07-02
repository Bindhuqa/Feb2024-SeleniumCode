package feb2024seleniumsessions;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsVsActionConcept {
     static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By Searchfield = By.xpath("//input[@name='search']");
		Actions act = new Actions(driver);
	Action action =	act.sendKeys(driver.findElement(Searchfield), "Automation").build();
	action.perform();
		
		

	}

}
