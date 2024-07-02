package feb2024seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// create WebElement+perform the actions(sendkeys,click,gettitleetc)
		// 1.id(unique attribute)
		// driver.findElement(By.id("input-email")).sendKeys("bindhu24@gmail.com");
		// driver.findElement(By.id("input-password")).sendKeys("bindhu@123");

		// 2.name(can be duplicate)
//	     driver.findElement(By.name("email")).sendKeys("bindhu24@gmail.com");
//	     driver.findElement(By.name("password")).sendKeys("bindhu@123");

		// 3.classname(can be duplicate)
		// driver.findElement(By.className("form-control")).sendKeys("bindhu24@gmail.com");

		// 4.xpath
//	     driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("bindhu24@gmail.com");
//	     driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("bindhu@123");
//	     driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();

		// 5.css selector
//	     driver.findElement(By.cssSelector("#input-email")).sendKeys("bindhu24@gmail.com");
//	     driver.findElement(By.cssSelector("#input-password")).sendKeys("bindhu@123");

		// 6.LinkText(always for links,with a>tag
		//driver.findElement(By.linkText("Register")).click();
		
		//7.partialLinkText
		//driver.findElement(By.partialLinkText("Delivery")).click();
		
		//8.TagName
		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);

	}

}
