package SeleniumTest1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownOrListBoxSort extends BaseSeleniumClass {
	DropDownOrListBoxSort(){
		super();
	}
	public static void main(String[] args) {
		new DropDownOrListBoxSort();
		driver.get("file:///home/chethan/Documents/logs/applicationForm.html");
		WebElement options= driver.findElement(By.xpath("//select[contains(@name,'Country')]"));
		Select select = new Select(options);
		List<WebElement> list =select.getOptions();
		ArrayList<String> arrList = new ArrayList<String>();
		for(int i=0;i<list.size();i++) {
			arrList.add(list.get(i).getText());
			System.out.println(arrList.get(i));
		}
		System.out.println("-------------------------------------------");
		Collections.sort(arrList);
		for(int i=0;i<arrList.size();i++) {
			System.out.println(arrList.get(i));
		}
		driver.close();
		
	}
}
