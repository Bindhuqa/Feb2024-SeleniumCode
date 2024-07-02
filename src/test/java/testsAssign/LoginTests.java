package testsAssign;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

	@Test(description = "checking Login title",priority=1)
	public void LoginTitleTest() {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Account Login","====Title is not matched====");

	}
	
	@Test(description="checking Login url",priority=2)
	public void LoginUrlTest() {
	String url = driver.getCurrentUrl();
	System.out.println(url);
	Assert.assertTrue(url.contains("account/login"),"====url is not matched====");
	
	}

}
