package feb2024seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameHandling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("automation");
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("testing");
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("1M Subscribers");

//		driver.switchTo().parentFrame();
//		driver.findElement(By.id("jex")).sendKeys(" selenium");
//		driver.switchTo().parentFrame();
//		driver.findElement(By.id("inp_val")).sendKeys(" is Love");
//		driver.switchTo().parentFrame();
//		String text = driver.findElement(By.tagName("h3")).getText();
//		System.out.println(text);
		
		driver.switchTo().defaultContent();
		String text = driver.findElement(By.tagName("h3")).getText();
		System.out.println(text);
		

	}

}
