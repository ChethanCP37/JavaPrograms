package SeleniumTest1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectClassForDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/chethan/Documents/TestProject/abc/src/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 25);
		driver.get("file:///home/chethan/Documents/logs/applicationForm.html");
		WebElement ele=driver.findElement(By.xpath("//select[contains(@name,'Country')]"));
		Select select = new Select(ele);
		select.selectByIndex(4);
		Thread.sleep(1000);
		select.selectByValue("india");
		Thread.sleep(1000);
		select.selectByVisibleText("Iran");
		Thread.sleep(1000);
		driver.close();
		Boolean m = select.isMultiple();
		System.out.println("Is it multiselect dropdown?? "+m);

		List<WebElement> selectedOptions=select.getAllSelectedOptions();
		for(int i=0;i<selectedOptions.size();i++) {
			selectedOptions.get(i);
		}
	}

}
