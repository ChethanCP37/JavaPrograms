package SeleniumTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitElementToBeClickable {

	public static void main(String[] args) {
		/*Following methods are used as conditions in explicit wait
		elementToBeSelected
		elementToBeClickable
		titleIs
		visibilityOfElementLocated
		*/
		
		System.setProperty("webdriver.chrome.driver", "/home/chethan/Documents/TestProject/abc/src/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 25);
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.findElement(By.xpath("//button[@id='enable-button']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Button']"))); //ElementToBeClickable()
		driver.findElement(By.xpath("//button[text()='Button']")).click();

		driver.findElement(By.xpath("//button[@id='checkbox']")).click();
		wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@type='checkbox']")));
		
		String title=driver.getTitle();
		wait.until((ExpectedConditions.titleIs(title)));
		
		wait.until(ExpectedConditions.titleContains(title));
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		wait.until(ExpectedConditions.urlContains("chercher"));
		
		wait.until(ExpectedConditions.urlToBe(url));
		
		driver.findElement(By.xpath("//button[@id='display-other-button']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='hidden']")));
		
		
		
		driver.close();
	}

}
