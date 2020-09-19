package SeleniumTest1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllDropdownOptions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/chethan/Documents/TestProject/abc/src/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("file:///home/chethan/Documents/logs/applicationForm.html");
		WebElement ele = driver.findElement(By.xpath("//select[contains(@name,'Country')]"));
		Select select = new Select(ele);
		List<WebElement> list=select.getOptions();
		for(int i=0;i<list.size();i++) {
			String str=list.get(i).getText();
			System.out.println(str);
		}
		System.out.println("----Selected options are ----");
		select.selectByIndex(1);
		select.selectByIndex(2);
		Thread.sleep(2000);
		List<WebElement> allOptions =select.getAllSelectedOptions();
		for(WebElement e:allOptions) {
			System.out.println(e.getText());
		}
		System.out.println("*******************************");
		WebElement el =select.getFirstSelectedOption();
		System.out.println(el.getText());
		driver.close();
	}
}
