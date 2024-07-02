package feb2024seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightPanelLinks {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		 List<WebElement> rightpanelLinks = driver.findElements(By.xpath("//div[@class='list-group']/a"));
		 System.out.println(rightpanelLinks.size());
		 for(WebElement e:rightpanelLinks) {
			String text =  e.getText();
			System.out.println(text);
			if(text.equals("Forgotten Password")) {
				e.click();
				break;
			}
		 }

	}

}
