package Day13_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestScript2 {

	@Test(dataProviderClass = Day13_DataProvider.TestData.class, dataProvider = "loginTestData")
	public void login(String uname, String pass) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Automation\\Selenium\\chromedriver-win64-v155\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///D:/Automation/OfflineWebsite-20260717T043309Z-1-001/OfflineWebsite/index.html");

		Thread.sleep(2000);

		WebElement email = driver.findElement(By.id("email"));

		WebElement password = driver.findElement(By.id("password"));

		WebElement button = driver.findElement(By.tagName("button"));

		email.sendKeys(uname);

		password.sendKeys(pass);

		button.click();

		Thread.sleep(2000);

		driver.close();

	}

}
