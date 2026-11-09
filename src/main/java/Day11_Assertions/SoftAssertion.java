package Day11_Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	@Test
	public void testScriptSoftAssertion() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Automation\\Selenium\\chromedriver-win64-v155\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		SoftAssert obj = new SoftAssert();

		driver.get("file:///D:/Automation/OfflineWebsite-20260717T043309Z-1-001/OfflineWebsite/index.html");

		Thread.sleep(2000);

		WebElement email = driver.findElement(By.id("email"));

		WebElement password = driver.findElement(By.id("password"));

		WebElement button = driver.findElement(By.tagName("button"));

		email.sendKeys("kiran@gmail.com");

		password.sendKeys("123456");

		button.click();

		obj.assertEquals(driver.getCurrentUrl(),
				"file:///D:/Automation/OfflineWebsite-20260717T043309Z-1-001/OfflineWebsite/pages/examples/dashboard1.html");

		Thread.sleep(2000);

		driver.close();

		obj.assertAll();

	}

}
