package SeleniumTest1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllLinksUrl  {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/chethan/Documents/TestProject/abc/src/drivers/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		List<WebElement> list=driver.findElements(By.xpath("//a[contains(@href,'https://')]"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			WebElement ele=list.get(i);
			String str=ele.getAttribute("href");
			System.out.println(str);
		}
	}

}