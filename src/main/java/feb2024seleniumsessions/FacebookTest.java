package feb2024seleniumsessions;

import java.util.Properties;

public class FacebookTest {

	public static void main(String[] args) {

		//String browser = "chrome";
		ReadProperty propReader = new ReadProperty();
		Properties prop = propReader.initProp();

		BrowserUtil brutil = new BrowserUtil();
		brutil.launchBrowser(prop.getProperty("browser"));
		brutil.launchUrl(prop.getProperty("url"));
		String actualtitle = brutil.getPageTitle();
		System.out.println(actualtitle);

		// title validation/checkpoint

		if (actualtitle.contains("Facebook - log in or sign up")) {
			System.out.println("Title is correct");

		} else {
			System.out.println("Title is incorrect");
		}
		
		String actualurl = brutil.getPageCurrentUrl();
		System.out.println(actualurl);
		
		//validation
		if(actualurl.contains("facebook")) {
			System.out.println("current url is correct");
		}
		else {
			System.out.println("current url is incorrect");
		}
		
		brutil.closeBrowser();

	}

}
