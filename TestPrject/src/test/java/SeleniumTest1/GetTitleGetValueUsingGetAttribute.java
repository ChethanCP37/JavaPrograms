package SeleniumTest1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleGetValueUsingGetAttribute {

	public static void main(String[] args) {
		/* Get the tool tip 
		 * Get the value of text
		 * Get the place holder name
		 * 
		 */
		System.setProperty("webdriver.chrome.driver", "/home/chethan/Documents/TestProject/abc/src/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.campaignmonitor.com/resources/glossary/page-title/");
		WebElement ele= driver.findElement(By.xpath("(//a[@title='Campaign Monitor'])[1]"));
		String title=ele.getAttribute("title");
		System.out.println(title);
		//input[@name="search"]
		WebElement search= driver.findElement(By.xpath("//input[@name='search']"));
		String placeHolder = search.getAttribute("placeholder");
		System.out.println(placeHolder);
		search.sendKeys("AshaChethan");
		String val=search.getAttribute("value");
		System.out.println(val);
	
		
	}

}
