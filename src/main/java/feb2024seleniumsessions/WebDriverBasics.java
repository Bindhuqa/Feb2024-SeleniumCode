package feb2024seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FireFoxDriver();
		
		
	    //enter url
		driver.get("https://www.google.com");
		
		//get the title
		 String title =driver.getTitle();
		 System.out.println(title);
		 if(title.equals("Google")) {
			 System.out.println("title is correct");
		 }
		 else {
			 System.out.println("title is not correct"); 
		 }
		 
		 //get the url
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("google")) {
			 System.out.println("url is correct");
		}
		else {
			 System.out.println("url is not correct");
		}
		
		//closing the browser
		driver.close();
	

	}

}
