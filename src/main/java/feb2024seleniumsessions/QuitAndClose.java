package feb2024seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitAndClose {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// enter url
		driver.get("https://www.google.com");

		// get the title
		String title = driver.getTitle();
		System.out.println(title);

		// get the url
		String url = driver.getCurrentUrl();
		System.out.println(url);
		// closing the browser
		//driver.quit();
		driver.close();
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());

	}

}
