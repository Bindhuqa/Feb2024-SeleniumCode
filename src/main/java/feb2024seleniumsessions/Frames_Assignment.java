package feb2024seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Assignment {
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		//driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='void1']")));
		int framescount = driver.findElements(By.tagName("frame")).size();
		System.out.println(framescount);

	}

}
