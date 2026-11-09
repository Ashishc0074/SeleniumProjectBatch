package Day13_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UserPage extends BaseClass {

	private WebElement AddUserTab = driver.findElement(By.xpath("//button[text()='Add User']"));

	public void clickOnAddUserTab() {
		AddUserTab.click();

	}

}
