package testscript;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import log.Log;
import pages.AddUserPage;
import pages.DashboardPage;
import pages.LoginPage;
import pages.UserPage;
import testbase.BaseClass;

public class AddUserScript extends BaseClass {

	@Test
	public void VerifyAddUser() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("kiran@gmail.com", "123456");
		Log.info("User entered Username And Password");

		Assert.assertEquals(driver.getCurrentUrl(),
				"file:///D:/Automation/OfflineWebsite-20260717T043309Z-1-001/OfflineWebsite/pages/examples/dashboard.html");

		Log.info("User redirect to the dashboard page");
		DashboardPage dashboardPage = new DashboardPage(driver);
		dashboardPage.clickOnUsersTab();

		Log.info("User Cliked on UserTab");
		UserPage userPage = new UserPage(driver);
		userPage.clickOnAddUserTab();

		Log.info("User click on Add userTab");

		AddUserPage addUserPage = new AddUserPage(driver);
		addUserPage.FillForm("Gaurav Raj", "7897458967", "gaurav@gmail.com", "Maharashtra", "123456");

	}

}
