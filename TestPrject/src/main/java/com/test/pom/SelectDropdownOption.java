package com.test.pom;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelectDropdownOption extends BaseClass {
	@BeforeTest
	public void launch() {
		setup();
	}
	
	@AfterTest
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test(enabled = true,invocationCount = 1,dependsOnMethods = {"selecDown","selecUp"},priority=0,groups = "dropDown")
	public void selectDropDown() {
		SelectDropdownActionUsingPom sel = new SelectDropdownActionUsingPom(driver);
		sel.selectOptionFromDropdown();
	}
	
	@Test
	public void selecDown() {
		Reporter.log("*****Test Case selecDown passed*****");
	}
	
	@Test(enabled=true)
	public void selecUp() {
		Reporter.log("*****Test Case selecUp passed*****");
	}
	

}
