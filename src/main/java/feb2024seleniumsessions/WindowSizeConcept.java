package feb2024seleniumsessions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSizeConcept {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 driver = new ChromeDriver();
		// driver.manage().window().maximize();
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		// driver.manage().window().minimize();
		 Dimension dm = new  Dimension(414, 149);
		 driver.manage().window().setSize(dm);
		 
		
		

	}

}
