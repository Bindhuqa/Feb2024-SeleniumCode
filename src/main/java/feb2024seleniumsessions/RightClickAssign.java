package feb2024seleniumsessions;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAssign {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		Actions act = new Actions(driver);
		By rightclickElement = By.xpath("//span[text()='right click me']");
		act.contextClick(driver.findElement(rightclickElement)).perform();
//		List<WebElement> rightclickOptions = driver
//				.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']//span"));
//		for (WebElement e : rightclickOptions) {
//			String options = e.getText();
//			System.out.println(options);
//			if (options.equals("Paste")) {
//				e.click();
//				break;
//			}
//		}
//		Alert alert = driver.switchTo().alert();
//		alert.accept();

		driver.findElement(By.xpath("//ul[@class='context-menu-list context-menu-root']//span[text()='Edit']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		
		act.contextClick(driver.findElement(rightclickElement)).perform();

		driver.findElement(By.xpath("//ul[@class='context-menu-list context-menu-root']//span[text()='Cut']")).click();
		driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();

	}

}
