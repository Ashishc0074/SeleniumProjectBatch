package utility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Helper {

	public static WebDriver driver;

	public static void alertAccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public static void selectDropdownValue(WebElement wb, String text) {
		Select select = new Select(wb);
		select.selectByVisibleText(text);
	}

}
