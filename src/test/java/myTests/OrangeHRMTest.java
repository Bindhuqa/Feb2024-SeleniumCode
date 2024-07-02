package myTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest {

	@Test(description = "checking orangeHRM title")
	public void orangeTitleTest() {

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "30-Day Advanced Free Trial | OrangeHRM", "---title is not matched----");

	}

	@Test(description = "checking orangeHRM url")
	public void orangeHRMUrlTest() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("30-day-free-trial"), "---url is not matched----");

	}

	@Test(description = "checking orangeHRM logo")
	public void orangeLogoTest() {
		boolean logo = driver.findElement(By.xpath("(//img[@alt='OrangeHRM Logo'])[1]")).isDisplayed();
		System.out.println(logo);
		Assert.assertEquals(logo, true, "---logo is missing----");

	}

}
