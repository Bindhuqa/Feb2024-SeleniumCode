package feb2024seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomAssign {
     static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 driver = new ChromeDriver();
		 driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		 Thread.sleep(9000);
		 String jsscript = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#pact1\")";
		 JavascriptExecutor js = ((JavascriptExecutor)driver);
		WebElement frameEle = (WebElement)js.executeScript(jsscript);
		driver.switchTo().frame(frameEle);
		driver.findElement(By.id("glaf")).sendKeys("Langley");
		 
		 
		
	}

}
