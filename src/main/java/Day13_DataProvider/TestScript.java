package Day13_DataProvider;

import org.testng.annotations.Test;

public class TestScript extends BaseClass {

	@Test
	public void loginScript() {

		LoginPage loginPage = new LoginPage();
		loginPage.login("kiran@gmail.com", "123456");

		DashboardPage dashboardPage = new DashboardPage();
		dashboardPage.clickOnUsersTab();

		UserPage userPage = new UserPage();
		userPage.clickOnAddUserTab();

		AddUserPage addUserPage = new AddUserPage();
		addUserPage.FillForm("Ashish Chavan", "789745897", "ashish@gmail.com", "Maharashtra", "123456");

	}

}
