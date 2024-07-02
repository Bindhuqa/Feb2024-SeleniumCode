package feb2024seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextConcept {
      static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		String frgtpswdtext = driver.findElement(By.linkText("Forgotten Password")).getText();
//		System.out.println(frgtpswdtext);
//		
//		String para = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/p[2]")).getText();
//		System.out.println(para);
		
		By frgtpwd  = By.linkText("Forgotten Password");
		ElementUtil eutil = new ElementUtil(driver);
		
	System.out.println(eutil.doGetText(frgtpwd));
		
		
		

		

	}

}
