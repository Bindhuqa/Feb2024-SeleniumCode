package feb2024seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisabled {
    static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");
		By submitbutton = By.id("submitButton");
		boolean f1 = driver.findElement(submitbutton).isDisplayed();
		System.out.println(f1);//true
		
		boolean f2 = driver.findElement(submitbutton).isEnabled();
		System.out.println(f2);//false
		
		boolean b1 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b1);//false
		
	
		
		driver.findElement(By.name("agreeTerms")).click();
		
		boolean f3 = driver.findElement(submitbutton).isDisplayed();
		System.out.println(f3);//true
		
		boolean b2 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b2);//true
		
		
		boolean f4 = driver.findElement(submitbutton).isEnabled();
		System.out.println(f4);
		

	}

}
