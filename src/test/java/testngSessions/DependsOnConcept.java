package testngSessions;

import org.testng.annotations.Test;

public class DependsOnConcept {
   @Test
   public void loginTest() {
	   System.out.println("login test");
	   
   }
   
   @Test(dependsOnMethods = "loginTest")
   public void addToCartTest() {
	   System.out.println("add to cart test");
   }
   
   
   //AAA pattern == Arrange Act Assert
}
