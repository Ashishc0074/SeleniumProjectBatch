package Day13_DataProvider;

import org.testng.annotations.DataProvider;

public class TestData {

	@DataProvider(name = "loginTestData")
	public static Object[][] login() {
		Object[][] x = { { "kiran@gmail.com", "123456" }, { "kiran1@gmail.com", "123456" },
				{ "kiran@gmail.com", "12345" }, { "kiran1@gmail.com", "12345" } };
		return x;
	}
}
