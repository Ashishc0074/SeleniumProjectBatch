package Day13_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseClass {

	private WebElement emailTextBox = driver.findElement(By.id("email"));

	private WebElement passwortTextBox = driver.findElement(By.id("password"));

	private WebElement submitButton = driver.findElement(By.tagName("button"));

	public void login(String email, String pass) {
		emailTextBox.sendKeys(email);
		passwortTextBox.sendKeys(pass);
		submitButton.click();
	}

}
