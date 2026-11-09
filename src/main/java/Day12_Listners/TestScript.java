package Day12_Listners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScript extends BaseClass {

	@Test
	public void loginScript() throws InterruptedException {

		WebElement email = driver.findElement(By.id("email"));

		WebElement password = driver.findElement(By.id("password"));

		WebElement button = driver.findElement(By.tagName("button"));

		email.sendKeys("kiran@gmail.com");

		Thread.sleep(2000);

		password.sendKeys("12345");

		button.click();

		Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Dashboard']")).isDisplayed());

	}

}
