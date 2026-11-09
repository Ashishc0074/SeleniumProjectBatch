package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Helper;

public class DashboardPage extends Helper {

	@FindBy(xpath = "//span[text()='Users']")
	private WebElement clickOnUserTab;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnUsersTab() {
		clickOnUserTab.click();
	}

}
