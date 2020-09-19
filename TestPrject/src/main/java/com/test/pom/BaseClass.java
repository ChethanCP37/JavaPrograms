package com.test.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	WebDriver driver=null;
	void setup() {
		System.setProperty("webdriver.chrome.driver", "/home/chethan/Documents/TestProject/abc/src/drivers/chromedriver");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///home/chethan/Documents/logs/applicationForm.html");
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
	}

}
