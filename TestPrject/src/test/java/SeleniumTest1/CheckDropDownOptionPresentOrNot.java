package SeleniumTest1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CheckDropDownOptionPresentOrNot extends BaseSeleniumClass {
	
	CheckDropDownOptionPresentOrNot(){
		super();
	}

	public static void main(String[] args) {
		int found = 0;
		new CheckDropDownOptionPresentOrNot();
		driver.get("file:///home/chethan/Documents/logs/applicationForm.html");
		WebElement listEle = driver.findElement(By.xpath("//select[contains(@name,'Country')]"));
		Select sel = new Select(listEle);
		List<WebElement> list =sel.getOptions();
		String expectedVal="INDIA";
		
		for(int i=0;i<list.size();i++) {
			if(expectedVal.equalsIgnoreCase(list.get(i).getText())) {
				found++;
			}
		}
		if(found>0) {
		System.out.println(expectedVal+" is present in list for "+found+" times");
		}
		
		
		
		



}

}
