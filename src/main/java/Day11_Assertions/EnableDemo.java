package Day11_Assertions;

import org.testng.annotations.Test;

public class EnableDemo {

	@Test
	public void login() {
		System.out.println("Login Method");
	}

	@Test(enabled = false)
	public void Search() {
		System.out.println("Search Method");
	}

	@Test
	public void logout() {
		System.out.println("Logout Method");
	}

}
