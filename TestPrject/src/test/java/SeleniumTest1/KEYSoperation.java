package SeleniumTest1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KEYSoperation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/chethan/Documents/TestProject/abc/src/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]")).sendKeys("ChethanCP");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]")).clear();
		Thread.sleep(1000);
		WebElement ele=driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]"));
		ele.sendKeys("ChethanCP_Kadur");
		ele.sendKeys(Keys.CONTROL+"a");
		ele.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(1000);
		ele.sendKeys(Keys.CONTROL+"a"+Keys.DELETE); //keys.DELETE also possible
		Thread.sleep(1000);
		ele.sendKeys("AshaChethan");
		String str=ele.getAttribute("title");
		System.out.println(str);
		//WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		ele.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(1000);
		
		WebElement forget=driver.findElement(By.xpath("//a[text()='Forgotten account?']"));
		forget.getAttribute("text");
		System.out.println(forget.getAttribute("text"));
		
		driver.get("https://www.google.com/search?q=gmail&oq=gmail&aqs=chrome..69i57j0l4j69i61.1131j0j7&sourceid=chrome&ie=UTF-8");
		WebElement link=driver.findElement(By.xpath("//a[@href='https://www.google.com/gmail/']"));
		link.getAttribute("text");
		System.out.println(link.getText());
		
		driver.get("https://reva.edu.in/");
		WebElement phone=driver.findElement(By.xpath("//span[@class='phone']"));
		System.out.println(phone.getText());
		
		
		driver.close();
	}

}
