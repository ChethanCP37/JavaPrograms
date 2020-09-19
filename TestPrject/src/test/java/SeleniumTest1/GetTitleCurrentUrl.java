package SeleniumTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetTitleCurrentUrl {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "/home/chethan/Documents/TestProject/abc/src/drivers/chromedriver");
		driver=new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 5);
	//	wait.until(ExpectedConditions.visibilit
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//div/input[@class='gLFyf gsfi']")).sendKeys("Chethan CP");
		driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]")).click();
		driver.findElement(By.xpath("(//h3)[1]")).click();
		String url= driver.getCurrentUrl();
		String title=driver.getTitle();
		System.out.println(url);
		System.out.println(title);
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
