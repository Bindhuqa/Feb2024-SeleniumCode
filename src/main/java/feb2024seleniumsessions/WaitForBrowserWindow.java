package feb2024seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForBrowserWindow {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		By linkedin = By.xpath("//a[contains(@href,'linkedin')]");
		ElementUtil elutil = new ElementUtil(driver);
		elutil.clickWhenReady(linkedin, 10);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		Boolean flag = wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		System.out.println(flag);

	}

	public static boolean waitForWindowsToBe(int totalwindows, int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.numberOfWindowsToBe(totalwindows));

	}

}
