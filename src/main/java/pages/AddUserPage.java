package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Helper;

public class AddUserPage extends Helper {

	@FindBy(id = "username")
	private WebElement usernameTextBox;

	@FindBy(id = "mobile")
	private WebElement mobileTextBox;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailTextBox;

	@FindBy(xpath = "//input[@id='Male']")
	private WebElement radioButton;

	@FindBy(xpath = "//select[@class='form-control']")
	private WebElement dropdownState;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordTextBox;

	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement submitbutton;

	public AddUserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void FillForm(String username, String mobile, String email, String state, String password) {
		usernameTextBox.sendKeys(username);
		mobileTextBox.sendKeys(mobile);
		emailTextBox.sendKeys(email);
		radioButton.click();
		selectDropdownValue(dropdownState, state);
		passwordTextBox.sendKeys(password);
		submitbutton.click();
		alertAccept();

	}

}
