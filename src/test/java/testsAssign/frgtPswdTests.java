package testsAssign;

import org.testng.Assert;
import org.testng.annotations.Test;

public class frgtPswdTests extends BaseTest{
	
	@Test(description = "checking Forgotten Password title",priority=1)
	public void frgtPswdTitleTest() {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/forgotten");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Forgot Your Password?","====Title is not matched====");

	}
	
	@Test(description="checking Forgotten Password url",priority=2)
	public void frgtPswdUrlTest() {
	String url = driver.getCurrentUrl();
	System.out.println(url);
	Assert.assertTrue(url.contains("account/forgotten"),"====url is not matched====");
	
	}



}
