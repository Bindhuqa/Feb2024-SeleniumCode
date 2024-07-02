package feb2024seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElememtReferenceException {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		WebElement emailid = driver.findElement(By.id("input-email"));
		emailid.sendKeys("naveen@gmail.com");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.id("input-email")).sendKeys("suma@gmail.com");

	}

}
