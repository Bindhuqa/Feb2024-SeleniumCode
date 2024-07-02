package testsAssign;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchTest extends SearchBaseTest {

	@DataProvider
	public Object[][] getSearchKeys() {
		return new Object[][] { { "macbook", "MacBook", "1" }, { "macbook", "MacBook Air","2"},
				{ "imac", "iMac", "3" }, { "samsung", "Samsung SyncMaster 941BW", "1"}

		};
	}

	@Test(dataProvider = "getSearchKeys")
	public void doLogin(String item, String product, String quantity) {

		

		driver.findElement(By.name("search")).sendKeys(item);
		driver.findElement(By.xpath("//div[@id='search']//button[@type='button']")).click();
		Actions action = new Actions(driver);
		action.scrollToElement(driver.findElement(By.linkText(product)))
        .click(driver.findElement(By.linkText(product))).perform();

		driver.findElement(By.id("input-quantity")).sendKeys(quantity);
		//driver.findElement(By.xpath("//img[@title='naveenopencart']")).click();

		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys(item);
		
		driver.findElement(By.xpath("//div[@id='search']//button[@type='button']")).click();
		action.scrollToElement(driver.findElement(By.linkText(product)))
        .click(driver.findElement(By.linkText(product))).perform();
		driver.findElement(By.id("input-quantity")).sendKeys(quantity);
		//driver.findElement(By.xpath("//img[@title='naveenopencart']")).click();

		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys(item);
		driver.findElement(By.xpath("//div[@id='search']//button[@type='button']")).click();
		action.scrollToElement(driver.findElement(By.linkText(product)))
        .click(driver.findElement(By.linkText(product))).perform();
		driver.findElement(By.id("input-quantity")).sendKeys(quantity);
		//driver.findElement(By.xpath("//img[@title='naveenopencart']")).click();

		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys(item);
		driver.findElement(By.xpath("//div[@id='search']//button[@type='button']")).click();
		action.scrollToElement(driver.findElement(By.linkText(product)))
        .click(driver.findElement(By.linkText(product))).perform();
		driver.findElement(By.id("input-quantity")).sendKeys(quantity);
		driver.findElement(By.xpath("//img[@title='naveenopencart']")).click();

	}

}
