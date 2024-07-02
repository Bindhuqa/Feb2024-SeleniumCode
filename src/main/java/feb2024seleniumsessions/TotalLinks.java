package feb2024seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {
	static WebDriver driver;

	public static void main(String[] args) {
		// total links
		// fetch the link text if it is available
		// check if the link is broken or not
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
//	List<WebElement> linkslist = driver.findElements(By.tagName("a"));
//	System.out.println(linkslist.size());
//	//to fetch the link text
//	for(int i=0;i<linkslist.size();i++) {
//		String Text = linkslist.get(i).getText();
//		
//		if(Text.length()!=0) {
//			System.out.println(Text);
//			}
//	}
//	System.out.println("------------------");
//	
//	for(WebElement e:linkslist) {
//		String text = e.getText();
//		if(text.length()!=0) {
//			System.out.println(text);
//		}
//	}
//	
		By links = By.tagName("a");
		By images = By.tagName("img");
		System.out.println("Total number of links " + getElementsCount(links));
		System.out.println("Total number of links " + getElementsCount(images));
		
		List<String> linkstextList = getElementTextList(links);
		System.out.println(linkstextList);
		System.out.println(linkstextList.contains("Tablets"));

	}

	public static List<WebElement> getElements(By Locator) {
		return driver.findElements(Locator);
	}

	public static int getElementsCount(By Locator) {
		return getElements(Locator).size();
	}

	public static List<String> getElementTextList(By Locator) {
		List<WebElement> eleTextList = getElements(Locator);
		List<String> TextList = new ArrayList<String>();
		for (WebElement e : eleTextList) {
			String text = e.getText();
			if (text.length() != 0) {
				TextList.add(text);
			}

		}
		return TextList;

	}

}
