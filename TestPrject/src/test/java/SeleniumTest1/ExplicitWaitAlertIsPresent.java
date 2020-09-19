package SeleniumTest1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitAlertIsPresent {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/chethan/Documents/TestProject/abc/src/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,20);
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().dismiss();

	}

}
