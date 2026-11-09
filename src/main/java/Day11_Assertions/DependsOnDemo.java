package Day11_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnDemo {
	@Test(priority = 1)
	public void login() {
		System.out.println("Login Method");
		Assert.assertTrue(false);
	}

	@Test(priority = 2, dependsOnMethods = "login")
	public void Search() {
		System.out.println("Search Method");
	}

	@Test(priority = 3, dependsOnMethods = "login")
	public void logout() {
		System.out.println("Logout Method");
	}
}
