package SeleniumTest1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseSeleniumClass {
	static WebDriver driver;
	public BaseSeleniumClass() {
		System.setProperty("webdriver.chrome.driver", "/home/chethan/Documents/TestProject/abc/src/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
}
