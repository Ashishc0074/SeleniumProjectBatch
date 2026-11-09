package Day13_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DashboardPage extends BaseClass {

	private WebElement usersTab = driver.findElement(By.xpath("//span[text()='Users']"));

	public void clickOnUsersTab() {
		usersTab.click();
	}

}
