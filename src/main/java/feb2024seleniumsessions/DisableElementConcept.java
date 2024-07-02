package feb2024seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableElementConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		//driver.findElement(By.id("pass")).click();
		// when we perform click action on disabled element,it doesnt give anything
		//driver.findElement(By.id("pass")).sendKeys("naveen");
		// when performung sendkeys action on disabled element,it gives you
		// NoEleementInterceptable Exception
		
		driver.findElement(By.id("passnew")).click();
		driver.findElement(By.id("passnew")).sendKeys("naveen");

	}

}
