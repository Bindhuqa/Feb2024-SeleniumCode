package feb2024seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorsConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(3000);
		 WebElement city = driver.findElement(By.linkText("Edmundston, Canada"));
		String rank = driver.findElement(with(By.tagName("p")).toLeftOf(city)).getText();
		System.out.println(rank);
		String AQI = driver.findElement(with(By.tagName("p")).toRightOf(city)).getText();
		System.out.println(AQI);
		String belowcity = driver.findElement(with(By.linkText("Cornwall, Canada")).below(city)).getText();
		System.out.println(belowcity);
		String abovecity =  driver.findElement(with(By.linkText("Dorval, Canada")).above(city)).getText();
		System.out.println(abovecity);
		String nearcity = driver.findElement(with(By.tagName("p")).near(city)).getText();
		System.out.println(nearcity);
	
		

	}

}
