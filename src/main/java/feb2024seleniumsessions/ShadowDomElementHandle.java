package feb2024seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomElementHandle {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 driver = new ChromeDriver();
		 driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		 Thread.sleep(9000);
	
	String jsscript ="return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
	JavascriptExecutor js = ((JavascriptExecutor)driver);
	WebElement pizza = (WebElement)js.executeScript(jsscript);
	pizza.sendKeys("veg pizza");
	
	
	
	}

}
