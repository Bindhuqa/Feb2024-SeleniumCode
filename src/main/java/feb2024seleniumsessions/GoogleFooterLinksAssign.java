package feb2024seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFooterLinksAssign {
   static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement> footerlinks = driver.findElements(By.xpath("//div[@class='KxwPGc SSwjIe']//a[@class='pHiOh']"));
		
		System.out.println(footerlinks.size());
		for(WebElement e:footerlinks) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals("Terms")) {
				e.click();
				break;
			}
		}

	}

}
