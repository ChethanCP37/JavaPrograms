package SeleniumTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/chethan/Documents/TestProject/abc/src/drivers/chromedriver");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.xpath("//div/input[@class='gLFyf gsfi']")).sendKeys("Chethan CP");
		driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]")).click();
		driver.findElement(By.xpath("(//h3)[1]")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		//driver.quit();
		driver.close();
	}

}
