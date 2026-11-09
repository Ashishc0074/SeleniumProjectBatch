package Day12_Listners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotDemo {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Automation\\Selenium\\chromedriver-win64-v155\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///D:/Automation/OfflineWebsite-20260717T043309Z-1-001/OfflineWebsite/index.html");

		Thread.sleep(2000);

		TakesScreenshot ts = (TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE);

		File dest = new File("D:\\Automation\\TakeScreenShot\\dummy.png");

		FileUtils.copyFile(src, dest);

		Thread.sleep(2000);

		driver.close();

	}

}
