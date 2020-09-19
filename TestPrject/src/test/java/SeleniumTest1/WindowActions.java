package SeleniumTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActions {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/chethan/Documents/TestProject/abc/src/drivers/chromedriver");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.xpath("//div/input[@class='gLFyf gsfi']")).sendKeys("Chethan CP");
		driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]")).click();
		driver.findElement(By.xpath("(//h3)[1]")).click();
		WebElement ele=driver.findElement(By.xpath("(//h3)[1]"));
		Thread.sleep(5000);
		Dimension d = new Dimension(600, 900);
		driver.manage().window().setSize(d);
		Thread.sleep(5000);
		driver.manage().window().setPosition(new Point(100,100));
		Point p=ele.getLocation();
		String s=ele.getText();
		System.out.println(s);
		
		
	}

}
