package feb2024seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTheFrames {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		driver.findElement(By.cssSelector("img[title='Vehicle-Registration-Forms-and-Examples']")).click();
		By frameloactor = By.xpath("//iframe[contains(@id,'frame-one')]");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameloactor));
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Testing Automation");

	}

	/**
	 * An expectation for checking whether the given frame is available to switch
	 * to.If the frame is available it switches the given driver to the specified
	 * frame.
	 * @param FrameLocator
	 * @param timeout
	 */
	public static void WaitForFrame(By FrameLocator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FrameLocator));
	}
	
	public static void WaitForFrameByIndex(int Frameindex, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frameindex));
	}
	
	public static void WaitForFrameByIDorName(String FrameIDorName, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FrameIDorName));
	}
	
	public static void WaitForFrameByElement(WebElement frameEle, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt( frameEle));
	}



}
