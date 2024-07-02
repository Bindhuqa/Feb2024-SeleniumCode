package myTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterPageTest extends BaseTest {
	public static String getRandomEmailid() {
		String emailid = "opencart"+System.currentTimeMillis()+"@gmail.com";
		return emailid;
	}
	@DataProvider
	public Object[][] getRegisterPageData() {
		return new Object[][] {
			{"Bindhu","selenium","9835637890","bindhu321"},
			{"Mounika","selenium","9835636780","mouni321"},
			{"Ravi","kiran","7659637890","ravi321"},
		};
		
	}

	@Test(dataProvider = "getRegisterPageData" )
	public void registerTest(String firstname,String lastname,String telephone,String password) {
		driver.findElement(By.id("input-firstname")).sendKeys(firstname);
		driver.findElement(By.id("input-lastname")).sendKeys(lastname);
		driver.findElement(By.id("input-email")).sendKeys(getRandomEmailid());
		driver.findElement(By.id("input-telephone")).sendKeys(telephone);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("input-confirm")).sendKeys(password);
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		String text = driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
		System.out.println(text);
		Assert.assertEquals(text, "Your Account Has Been Created!");
		
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.linkText("Register")).click();
	}

}
