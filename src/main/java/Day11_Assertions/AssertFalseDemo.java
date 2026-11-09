package Day11_Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalseDemo {

	@Test
	public void TestScript() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Automation\\Selenium\\chromedriver-win64-v155\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(
				"file:///D:/Automation/OfflineWebsite-20260717T043309Z-1-001/OfflineWebsite/pages/examples/add_user.html");

		Thread.sleep(2000);

		WebElement RadioButton = driver.findElement(By.xpath("//input[@id='Male']"));

		// RadioButton.click();

		Thread.sleep(2000);

		Assert.assertFalse(RadioButton.isSelected());

		Thread.sleep(2000);

		driver.close();

	}

}
