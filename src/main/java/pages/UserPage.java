package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Helper;

public class UserPage extends Helper {

	@FindBy(xpath = "//button[text()='Add User']")
	private WebElement addUserTab;

	public UserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnAddUserTab() {
		addUserTab.click();
	}

}
