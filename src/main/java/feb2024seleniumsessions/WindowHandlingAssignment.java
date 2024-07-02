package feb2024seleniumsessions;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingAssignment {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	String parentwindowid =	driver.getWindowHandle();
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
	 Set<String> handles = driver.getWindowHandles();
	Iterator<String> it =  handles.iterator();
	parentwindowid = it.next();
	String childwindowid = it.next();
	
	driver.switchTo().window(childwindowid);
	System.out.println(driver.getCurrentUrl());
	driver.close();
	driver.switchTo().window(parentwindowid);
	System.out.println(driver.getCurrentUrl());
	
//*************************************************
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
	Set<String> handles2 = driver.getWindowHandles();
	Iterator<String> it2 = handles2.iterator();
	parentwindowid = it2.next();
	childwindowid = it2.next();
	driver.switchTo().window(childwindowid);
	System.out.println(driver.getCurrentUrl());
	driver.close();
	driver.switchTo().window(parentwindowid);
	System.out.println(driver.getCurrentUrl());
	
	//*************************************************
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
	Set<String> handles3 = driver.getWindowHandles();
	Iterator<String> it3 = handles3.iterator();
	parentwindowid = it3.next();
	childwindowid = it3.next();
	Thread.sleep(3000);
	driver.switchTo().window(childwindowid);
	System.out.println(driver.getCurrentUrl());
	driver.close();
	driver.switchTo().window(parentwindowid);
	System.out.println(driver.getCurrentUrl());
	

	//*************************************************
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
	Set<String> handles4 = driver.getWindowHandles();
	Iterator<String> it4 = handles4.iterator();
	parentwindowid = it4.next();
	childwindowid = it4.next();
	driver.switchTo().window(childwindowid);
	System.out.println(driver.getCurrentUrl());
	driver.close();
	driver.switchTo().window(parentwindowid);
	System.out.println(driver.getCurrentUrl());
	
	
	
	
		

	}

}
