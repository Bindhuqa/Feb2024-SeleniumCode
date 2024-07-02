package feb2024seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeListConcept {
    static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
//		By images = By.tagName("img");
//		List<WebElement> imgslist = getElements(images);
//		for(WebElement e: imgslist) {
//			String AttributeValue = e.getAttribute("src");
//			if(AttributeValue!=null) {
//				System.out.println(AttributeValue);	
//			}
//			
//		}
         By links = By.tagName("a");
         getAttributeList(links,"href");
	}
	
	public static List<String> getAttributeList(By Locator,String Attributename) {
		List<WebElement> imgslist = getElements(Locator);
		List<String> attrlist = new ArrayList<String>();
		for(WebElement e: imgslist) {
			String AttributeValue = e.getAttribute(Attributename);
			if(AttributeValue!=null) {
				attrlist.add(AttributeValue);
				System.out.println(AttributeValue);	
			}
			
		}
		return attrlist;
	}
	public static List<WebElement> getElements(By Locator) {
		return driver.findElements(Locator);
	}

}
