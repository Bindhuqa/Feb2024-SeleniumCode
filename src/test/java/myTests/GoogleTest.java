package myTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

	@Test(description = "checking Google title")
	public void googleTitleTest() {

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google", "---title is not matched----");

	}

	@Test(description = "checking login page url")
	public void googleUrlTest() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("google"), "---url is not matched----");

	}

	@Test(description = "checking Google logo")
	public void loginPageLogoTest() {
		boolean logo = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		System.out.println(logo);
		Assert.assertEquals(logo, true, "---logo is missing----");

	}

}
