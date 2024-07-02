package feb2024seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {

	WebDriver driver;

	public WebDriver launchBrowser(String browsername) {
		System.out.println("the browsername is " + browsername);

		switch (browsername.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("plz pass the right browser :" + browsername);
			throw new BrowserException("INVALID BROWSER...... " + browsername);

		}
		return driver;
	}

	public void launchUrl(String url) {
		if (url == null) {
			throw new BrowserException("INVALID URL...... " + url);

		}
		if (url.isBlank() || url.isEmpty()) {
			throw new BrowserException("Empty or Blank url...... " + url);
		}
		if (url.indexOf("http") == -1 || url.indexOf("http") > 0) {
			throw new BrowserException("http is missing...... " + url);
		}
		driver.get(url.trim());
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getPageCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}

}
