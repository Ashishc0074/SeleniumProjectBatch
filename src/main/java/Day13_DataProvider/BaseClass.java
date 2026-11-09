package Day13_DataProvider;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public static WebDriver driver;

	@BeforeClass
	public void openBrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Automation\\Selenium\\chromedriver-win64-v155\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///D:/Automation/OfflineWebsite-20260717T043309Z-1-001/OfflineWebsite/index.html");

		Thread.sleep(2000);

	}

	@AfterClass
	public void closeBrowser() throws InterruptedException {

		Thread.sleep(2000);

		driver.close();

	}

	public static void selectDropdownValue(WebElement wb, String text) {
		Select select = new Select(wb);
		select.selectByVisibleText(text);
	}

	public static void alertAccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

}
