package SeleniumTest1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationAndSizeOfElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/chethan/Documents/TestProject/abc/src/drivers/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement logo = driver.findElement(By.xpath("//img[contains(@class,'fb_logo')]"));
		Point p=logo.getLocation();
		System.out.println("x and Y co's are "+p.getX()+" & "+p.getY());
		Dimension d = logo.getSize();
		System.out.println("height and width of logo are "+d.getHeight()+" & "+d.getWidth());
		driver.close();


		//img[contains(@class,'fb_logo')]
	}

}
