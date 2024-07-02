package testngSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartLoginTest {
   WebDriver driver;
   
   @BeforeMethod
   public void setUp() {
	   driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.manage().deleteAllCookies();
	   driver.manage().window().maximize();
	   driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	   
   }
   
   @Test(description="checking login page title")
   public void loginPageTitleTest() {
	String title =  driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title, "Account Login","---title is not matched----");
	   
 }
   
   @Test(description="checking login page url")
   public void loginPageUrlTest() {
	   String url =  driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("route=account/login"),"---url is not matched----");
	   
   }
   
   @Test(description="checking login page logo")
   public void loginPageLogoTest() {
	boolean logo =   driver.findElement(By.cssSelector(".img-responsive")).isDisplayed();
	System.out.println(logo);
	Assert.assertEquals(logo, true,"---logo is missing----");
	   
   }
   
   
   @AfterMethod
   public void tearDown() {
	   driver.quit();
   }
}
