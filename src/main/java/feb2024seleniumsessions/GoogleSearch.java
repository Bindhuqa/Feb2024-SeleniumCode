package feb2024seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
//		
//		By searchfield = By.name("q");
//		By suggestions = By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']/span");
//		driver.findElement(By.name("q")).sendKeys("Naveen Automation Labs");
//		Thread.sleep(3000);
//		List<WebElement> suggestions = driver
//				.findElements(By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']/span"));
//		System.out.println(suggestions.size());
//		for(WebElement e:suggestions) {
//			String suggestionslist = e.getText();
//			System.out.println(suggestionslist);
//			if(suggestionslist.contains("reviews")) {
//			e.click();
//			break;
//		}
//			}
		
		driver.get("https://www.flipkart.com/");
		 By searchfield = By.name("q");
		By suggestions = By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//div[@class='YGcVZO _2VHNef']");
		
		doSearch(searchfield,"macbook",suggestions,"pro m3");
//		
	
	}
	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);
	}

	public static void doSearch(By searchfield,String searchkey,By suggestions,String value ) throws InterruptedException {
		getElement(searchfield).sendKeys(searchkey);
		Thread.sleep(3000);
		List<WebElement> suggestionsList = driver
			.findElements(suggestions);
		System.out.println(suggestionsList.size());
	for(WebElement e:suggestionsList) {
			String suggestionslist = e.getText();
			System.out.println(suggestionslist);
		if(suggestionslist.contains(value)) {
			e.click();
			break;
		}
		}
	}

}
