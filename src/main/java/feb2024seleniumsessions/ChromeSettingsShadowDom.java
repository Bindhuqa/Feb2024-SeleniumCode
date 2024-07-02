package feb2024seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeSettingsShadowDom {
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("chrome://settings/");
		String jsscript = "return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")";
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 WebElement chrome = (WebElement)js.executeScript(jsscript);
		 chrome.sendKeys("automation");
		
		

	}

}
