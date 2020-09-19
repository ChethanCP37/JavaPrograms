package SeleniumTest1;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class SelectDeselectAllCheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/chethan/Documents/TestProject/abc/src/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 25);
		driver.get("file:///home/chethan/Documents/logs/applicationForm.html");
		
		List<WebElement> list =driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			WebElement ele=list.get(i);
			ele.click();
			Thread.sleep(500);
		}
		Thread.sleep(1000);
		
		for(WebElement ele:list) {
			ele.click();
			Thread.sleep(500);
		}
		Thread.sleep(1000);
		driver.close();
	}

}
