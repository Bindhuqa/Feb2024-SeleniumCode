package feb2024seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForJSAlert {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		System.out.println(alert.getText());
//		alert.accept();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		alertSendkeys("automation",5);
		

	}

	public static Alert waitForJSAlert(int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.alertIsPresent());

	}

	public static String getJSAlertText(int timeout) {
		Alert alert = waitForJSAlert(timeout);
		String text = alert.getText();
		alert.accept();
		return text;

	}

	public static void acceptTheAlert(int timeout) {
		waitForJSAlert(timeout).accept();

	}

	public static void dismissTheAlert(int timeout) {
		waitForJSAlert(timeout).dismiss();

	}

	public static void alertSendkeys(String value, int timeout) {
		Alert alert = waitForJSAlert(timeout);
		alert.sendKeys(value);
		alert.accept();

	}

}
