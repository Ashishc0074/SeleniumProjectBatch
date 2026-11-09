package Day10_Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("after Method");

	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class");

	}

	@AfterClass
	public void afterClass() {
		System.out.println("after class");

	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");

	}

	@AfterTest
	public void afterTest() {
		System.out.println("after Test");

	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite");

	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite");

	}
}
