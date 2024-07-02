package feb2024seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudoElementsHandle {
	static WebDriver driver;
	public static void main(String[] args) {
		
		//pseudo classes
		//::before
		//::after
		//::has
		
		 driver = new ChromeDriver();
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		 String firstnamejs = "return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"), '::before').getPropertyValue('content');";
		 JavascriptExecutor js = ((JavascriptExecutor)driver);
		String man_fieldText = js.executeScript(firstnamejs).toString();
		System.out.println(man_fieldText);
		
		 String firstnamejs_colour = "return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"), '::before').getPropertyValue('color');";
		String colour = js.executeScript(firstnamejs_colour).toString();
		System.out.println(colour);

	}

}
