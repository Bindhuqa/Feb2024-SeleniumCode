package feb2024seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethodChainingRegister {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		WebElement firstname = driver.findElement(By.id("input-firstname"));
//		Actions act = new Actions(driver);
//		act.sendKeys(firstname, "Amit")
//		        .sendKeys(Keys.TAB)
//		           .pause(1000)
//		             .sendKeys("Sharma")
//		                .sendKeys(Keys.TAB)
//		                   .pause(1000)
//		                   .sendKeys("Sharma@gmail.com")
//			                .sendKeys(Keys.TAB)
//			                   .pause(1000)
//			                   .sendKeys("9843796457")
//				                .sendKeys(Keys.TAB)
//				                   .pause(1000)
//				                     .sendKeys("amit@123")
//					                .sendKeys(Keys.TAB)
//					                   .pause(1000)
//					                      .sendKeys("amit@123")
//					                        .pause(1000)
//					                          .sendKeys(Keys.TAB)
//					                           .sendKeys(Keys.TAB)
//					                             .sendKeys(Keys.TAB)
//					                               .pause(1000)
//					                                .sendKeys(Keys.SPACE)
//					                                 .pause(1000)
//					                                   .sendKeys(Keys.TAB)
//					                                    .pause(1000)
//					                                     .sendKeys(Keys.ENTER)
//					                                       .build().perform();
		
		driver.get("https://www.flipkart.com/");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys("Macbook")
		.build().perform();
		
					                      
					                      
					                      
					                      
					                      
					                     

					                      
					                      
					               
						                  
						                   
		
		

	}

}
