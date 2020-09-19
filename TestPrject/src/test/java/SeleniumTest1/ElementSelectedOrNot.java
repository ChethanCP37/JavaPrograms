package SeleniumTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementSelectedOrNot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/chethan/Documents/TestProject/abc/src/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 25);
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		WebElement cli=driver.findElement(By.xpath("//button[@id='checkbox']"));
		cli.click();
		Boolean b=wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@type='checkbox']")));
		System.out.println(b);
		WebElement clickk=driver.findElement(By.xpath("//input[@type='checkbox']"));
		Boolean c=clickk.isSelected();
		System.out.println(c);
		
		

	}

}
