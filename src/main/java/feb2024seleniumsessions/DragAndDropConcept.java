package feb2024seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		Actions act = new Actions(driver);
		WebElement sourceElement = driver.findElement(By.id("draggable"));
		WebElement targetElement = driver.findElement(By.id("droppable"));
		
		//act.clickAndHold(driver.findElement(By.id("draggable")))
		       //    .moveToElement(driver.findElement(By.id("droppable"))).release().perform();
		
		act.dragAndDrop(sourceElement, targetElement).build().perform();
		
		

	}
	
	public static void dragAndDrop(By sourceLocator,By targetLocator) {
		WebElement sourceElement = driver.findElement(By.id("draggable"));
		WebElement targetElement = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.dragAndDrop(sourceElement, targetElement).build().perform();
		
	}

}
