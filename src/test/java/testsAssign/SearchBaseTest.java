package testsAssign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import feb2024seleniumsessions.BrowserException;

public class SearchBaseTest {
	
	WebDriver driver;

	@Parameters({ "browser" ,"url","username","password"})
	@BeforeTest
	public void setUp(String browsername,String url,String username,String password) {

		switch (browsername.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "FireFox":
			driver = new FirefoxDriver();
			break;
		case "Edge":
			driver = new EdgeDriver();
			break;
		case "Safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("plz pass the right browser" + browsername);
			throw new BrowserException("wrong browser passed");

		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("input-email")).sendKeys(username);
	    driver.findElement(By.id("input-password")).sendKeys(password);
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
		

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}


}
