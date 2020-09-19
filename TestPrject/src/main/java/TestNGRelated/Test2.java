package TestNGRelated;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
	//run testngdummy.xml to excute this class file
	@BeforeTest
	public void beforeTest() {
		System.out.println("Test2 class: Before_Test method of Test2 class");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("Test2 class: After_Test method of Test2 class");
	}
	@Test
	public void test1() {
		System.out.println("Test2 class: test1() - no groups of Test2 class");
	}
	@Test
	public void test2() {
		System.out.println("Test2 class: test2() - no groups of Test2 class");
	}
	@Test(groups= {"SmokeTest","Basic"})
	public void test3() {
		System.out.println("Test2 class: test3() - groups:SmokeTest and Basic of Test2 class");
	}
	@BeforeSuite()
	public void firstMethod() {
		System.out.println("Test2 class: Before_Suite of Test2 class");
	}
	@AfterSuite()
	public void lastMethod() {
		System.out.println("Test2 class: After_Suite of Test2 class--------------------------------");
	}

}
