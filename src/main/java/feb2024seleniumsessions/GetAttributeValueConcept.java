package feb2024seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValueConcept {
	 static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By frgtpwd  = By.linkText("Forgotten Password");
		String value = driver.findElement(frgtpwd).getAttribute("href");
		System.out.println(value);
		
		String emailvalue = driver.findElement(By.id("input-email")).getAttribute("placeholder");
		System.out.println(emailvalue);
		
		 driver.findElement(By.id("input-email")).sendKeys("bindhu@gmail.com");
		String enteredvalue= driver.findElement(By.id("input-email")).getAttribute("value");
		 
		System.out.println(enteredvalue);
	}

}
