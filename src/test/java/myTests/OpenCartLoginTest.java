package myTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartLoginTest extends BaseTest {

	@Test(description = "checking login page title")
	public void loginPageTitleTest() {

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Account Login", "---title is not matched----");

	}

	@Test(description = "checking login page url")
	public void loginPageUrlTest() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("route=account/login"), "---url is not matched----");

	}

	@Test(description = "checking login page logo")
	public void loginPageLogoTest() {
		boolean logo = driver.findElement(By.cssSelector(".img-responsive")).isDisplayed();
		System.out.println(logo);
		Assert.assertEquals(logo, true, "---logo is missing----");

	}

}
