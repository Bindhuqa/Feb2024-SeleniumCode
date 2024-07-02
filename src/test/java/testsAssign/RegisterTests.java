package testsAssign;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTests extends BaseTest{
	

	@Test(description = "checking Register title",priority=1)
	public void registerTitleTest() {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Register Account","====Title is not matched====");

	}
	
	@Test(description="checking Resgister url",priority=2)
	public void registerUrlTest() {
	String url = driver.getCurrentUrl();
	System.out.println(url);
	Assert.assertTrue(url.contains("account/register"),"====url is not matched====");
	
	}


}
