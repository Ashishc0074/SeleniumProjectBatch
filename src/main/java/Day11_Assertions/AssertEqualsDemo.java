package Day11_Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsDemo {

	@Test
	public void loginScript() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Automation\\Selenium\\chromedriver-win64-v155\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///D:/Automation/OfflineWebsite-20260717T043309Z-1-001/OfflineWebsite/index.html");

		Thread.sleep(2000);

		WebElement email = driver.findElement(By.id("email"));

		WebElement password = driver.findElement(By.id("password"));

		WebElement button = driver.findElement(By.tagName("button"));

		email.sendKeys("kiran@gmail.com");

		password.sendKeys("123456");

		button.click();

		Assert.assertEquals(driver.getCurrentUrl(),
				"file:///D:/Automation/OfflineWebsite-20260717T043309Z-1-001/OfflineWebsite/pages/examples/dashboard.html");

		Thread.sleep(2000);

		driver.close();

	}

}
