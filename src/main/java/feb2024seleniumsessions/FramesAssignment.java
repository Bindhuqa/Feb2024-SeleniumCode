package feb2024seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FramesAssignment {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		driver.findElement(By.cssSelector("img[title='Vehicle-Registration-Forms-and-Examples']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Testing Automation");
		driver.findElement(By.cssSelector("input#RESULT_TextField-3")).sendKeys("Canada");
		driver.findElement(By.cssSelector("textarea#RESULT_TextArea-5"))
				.sendKeys("Selenium user interface Automation tool");
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("05/09/2024");
		driver.findElement(By.id("RESULT_TextField-8")).sendKeys("Bindhu");
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-9']")).sendKeys("Karlapudi");
		driver.findElement(By.id("RESULT_TextField-10")).sendKeys("20261 72b ave");
		driver.findElement(By.cssSelector("#RESULT_TextField-11")).sendKeys("Langley");
		driver.findElement(By.id("RESULT_TextField-12")).sendKeys("Vancouver");
		Select select = new Select(driver.findElement(By.id("RESULT_RadioButton-13")));
		select.selectByVisibleText("California");
		driver.findElement(By.id("RESULT_TextField-14")).sendKeys("V2Y3M8");
		driver.findElement(By.xpath("//input[@placeholder='( ___ ) ___ - ____']")).sendKeys("2368629139");
		driver.findElement(By.id("RESULT_TextField-16")).sendKeys("bindhu.05@gmail.com");
		driver.findElement(By.id("FSsubmit")).click();
		String text = driver.findElement(By.cssSelector(".success-text")).getText();
		System.out.println(text);

	}

}
