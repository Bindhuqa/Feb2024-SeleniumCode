package feb2024seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConceptWithException {
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		try{
			driver.findElement(By.id("input-email")).sendKeys("bindhu24@gmail.com");
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		}
		
		
		driver.findElement(By.id("input-password")).sendKeys("bindhu@123");
		
		

	}

}
