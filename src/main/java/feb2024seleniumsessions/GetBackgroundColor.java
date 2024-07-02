package feb2024seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetBackgroundColor {
	static WebDriver driver;
	public static void main(String[] args) {
		
		 driver = new ChromeDriver();
		 driver.get("https://classic.crmpro.com/");
		
		WebElement color = driver.findElement(By.xpath("//input[@value='Login']"));
		String bgcolor = color.getCssValue("backgroundColor");
		System.out.println(bgcolor);

	}

}
