package utility;

import org.testng.annotations.DataProvider;

public class TestDataProvide {

	@DataProvider(name = "TestData")
	public static Object[][] login() {

		Object[][] x = { { "kiran@gmail.com", "123456" } };

		return x;

	}

}
