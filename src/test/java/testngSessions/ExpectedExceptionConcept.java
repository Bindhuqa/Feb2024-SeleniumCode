package testngSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	String name;
	@Test(expectedExceptions=Exception.class)
	public void addToCartTest() {
		System.out.println("add to cart test");
		int i=9/3;
		ExpectedExceptionConcept obj = null;
		System.out.println(obj.name);
	}
}
