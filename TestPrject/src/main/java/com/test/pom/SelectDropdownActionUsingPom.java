package com.test.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownActionUsingPom {
	WebDriver driver=null;
	
	@FindBy(xpath="//select[contains(@name,'Country')]")
	WebElement dropDown;
	
	SelectDropdownActionUsingPom(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void selectOptionFromDropdown() {
		Select select = new Select(dropDown);
		select.selectByIndex(3);
		
	}
}
