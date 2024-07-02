package testsAssign;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	 WebDriver driver;
	   
	   @BeforeTest
	   public void setUp() {
		   driver = new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   driver.manage().deleteAllCookies();
		   driver.manage().window().maximize();
		   
		   
	   }
	   
	   @AfterTest
	   public void tearDown() {
		   driver.quit();
	   }


}
