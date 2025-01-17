package feb2024seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomElementWithIframeHandling {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 driver = new ChromeDriver();
		 driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		 Thread.sleep(5000);
		 driver.switchTo().frame("pact");
		 String jsscript = "return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")";
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 WebElement tea = (WebElement)js.executeScript(jsscript);
		 tea.sendKeys("masala tea");

	}

}
