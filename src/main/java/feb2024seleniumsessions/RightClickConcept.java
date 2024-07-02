package feb2024seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		Actions act = new Actions(driver);
		By rightclickElement = By.xpath("//span[text()='right click me']");
		
		act.contextClick(driver.findElement(rightclickElement)).perform();
	List<WebElement> rightclickOptions = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']//span"));
	for(WebElement e:rightclickOptions) {
		String options = e.getText();
		System.out.println(options);
		if(options.equals("Paste")) {
			e.click();
			break;
		}
	}
	
	
		
	}
	public static void doRightClick(By Locator) {
		Actions act = new Actions(driver);
		act.contextClick(driver.findElement(Locator)).perform();
	}

}
