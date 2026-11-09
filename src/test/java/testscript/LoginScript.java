package testscript;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import log.Log;
import pages.LoginPage;
import testbase.BaseClass;

public class LoginScript extends BaseClass {

	@Test(dataProviderClass = utility.TestDataProvide.class, dataProvider = "TestData")
	public void LoginScript(String uname, String pass) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(uname, pass);

		Log.info("User entered Username And Password");

		Assert.assertEquals(driver.getCurrentUrl(),
				"file:///D:/Automation/OfflineWebsite-20260717T043309Z-1-001/OfflineWebsite/pages/examples/dashboard.html");

	}

}
