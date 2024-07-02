package feb2024seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsPopupAlertHandling {
   static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		//js alerts
		//1.alert();--ok
		//2.prompt();--ok and cancel
		//3.confirm();---textfield
		
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		
//		Thread.sleep(3000);
//		
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		alert.accept();//to ok
//		alert.dismiss();//to remove the alert
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Thread.sleep(3000);
//		Alert alert = 	driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		//alert.accept();//to ok
//		alert.dismiss();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert alert = 	driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.sendKeys("bindhu");
		alert.accept();
		
		

	}

}
