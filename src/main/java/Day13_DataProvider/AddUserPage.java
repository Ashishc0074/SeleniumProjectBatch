package Day13_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddUserPage extends BaseClass {

	private WebElement usernameTextBox = driver.findElement(By.xpath("//input[@id='username']"));
	private WebElement MobileTextBox = driver.findElement(By.xpath("//input[@id='mobile']"));
	private WebElement EmailTextBox = driver.findElement(By.xpath("//input[@id='email']"));
	private WebElement RadioButton = driver.findElement(By.xpath("//input[@id='Male']"));
	private WebElement dropDownTextBox = driver.findElement(By.xpath("//select[@class='form-control']"));

	private WebElement passwodTextBox = driver.findElement(By.xpath("//input[@id='password']"));
	private WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));

	public void FillForm(String username, String mobile, String email, String state, String password) {
		usernameTextBox.sendKeys(username);
		MobileTextBox.sendKeys(mobile);
		EmailTextBox.sendKeys(email);
		RadioButton.click();
		selectDropdownValue(dropDownTextBox, state);
		passwodTextBox.sendKeys(password);
		submitButton.click();
		alertAccept();

	}

}
