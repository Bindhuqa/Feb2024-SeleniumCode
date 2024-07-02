package feb2024seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		BrowserUtil brutil = new BrowserUtil();
	WebDriver driver =	brutil.launchBrowser("chrome");
	brutil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	System.out.println(brutil.getPageTitle());
	System.out.println(brutil.getPageCurrentUrl());
	
	By emailid = By.id("input-email");
	By password = By.id("input-password");
	
	ElementUtil eu = new ElementUtil(driver);
	eu.doSendkeys(emailid, "bindhu24@gmail.com");
	eu.doSendkeys(password, "bindhu@123");
	
	brutil.closeBrowser();
	

	}

}
