package feb2024seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElementHandling {

	public static void main(String[] args) throws InterruptedException {
		// SVG
		// normal xpath will not work with SVG
		// *[local-name()='svg']-----parent
		//*[name()='']------child
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.xpath("(//*[local-name()='svg'])[1]")).click();
//		

		driver.get("https://petdiseasealerts.org/forecast-map#/");
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));

		String xpath = "//*[local-name()='svg'and@id='map-svg']/*[name()='g'and@id='features']/*[name()='g'and@id='regions']//*[name()='path']";
		String xpath2 = "//*[local-name()='svg'and@id='map-svg']//*[name()='path']";
		List<WebElement> statelist = driver.findElements(By.xpath(xpath2));
		System.out.println(statelist.size());
		for (WebElement e : statelist) {
			String statename = e.getAttribute("name");
			System.out.println(statename);
		}
	}

}
