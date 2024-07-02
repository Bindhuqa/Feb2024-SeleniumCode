package feb2024seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {
      static WebDriver driver;
	public static void main(String[] args) {
		
		 driver = new ChromeDriver();
		 
//		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		 JavascriptExecutor js =(JavascriptExecutor)driver;
//		String title = js.executeScript(" return document.title").toString();
//		System.out.println(title);
//		
//		JavaScriptUtil jsutil = new JavaScriptUtil(driver);
//		String url = jsutil.getURLByJs();
//		System.out.println(url);
//		
//		jsutil.generateJSAlert("hi,this my jsAlert Popup");
//		jsutil.generateJSPrompt("hi,this is bindhu", " bindhu");
//		
		 
		// driver.get("https://classic.freecrm.com/");
		 JavaScriptUtil jsutil = new JavaScriptUtil(driver);
//	String pagetext =	 jsutil.getPageInnerText();
//	System.out.println(pagetext);
//	
//	jsutil.scrollMiddlePageDown();
//	jsutil.scrollPageDown();
//	jsutil.scrollPageUp();
//	jsutil.scrollPageDown("300");
//	jsutil.scrollIntoView(driver.findElement(By.xpath("//h3[text()='Alerts & Reminders']")));
//	//jsutil.zoomFirefoxChromeEdgeSafari("400");
//	jsutil.drawBorder(driver.findElement(By.xpath("//h3[text()='Alerts & Reminders']")));
//		 
		 driver.get("https://app.hubspot.com/login");
		 WebElement email = driver.findElement(By.id("username"));
		 WebElement password = driver.findElement(By.id("password"));
		 WebElement login = driver.findElement(By.id("loginBtn"));
		 jsutil.flash(email);
		 email.sendKeys("bindhu@gmail.com");
		 jsutil.flash(password);
		 password.sendKeys("bindhu@24");
		 jsutil.flash(login);
		 login.click();
		 
		

	}

}
