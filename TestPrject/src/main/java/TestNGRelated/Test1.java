package TestNGRelated;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	//run testngdummy.xml to excute this class file
	@BeforeTest
	public void beforeTest() {
		System.out.println("Test1 class: Before_Test method of Test1 class");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("Test1 class: After_Test method of Test1 class");
	}
	@Test(priority=-1,enabled=true, groups={"SmokeTest","RegressionTest"}) // priority=0 will run testing1 method first then testing2
	public void test_1() {
		System.out.println("Test1 class: test_1() - groups:Smoke and RegressionTest  of Test1 class");
	}
	@Test(groups="FuntionTest")
	public void test_2() {
		System.out.println("Test1 class: test_2() - groups:FuntionTest of Test1 class");
	}
	@Test(groups= {"Basic"})
	public void test_3() {
		System.out.println("Test1 class: test_3() - no groups of Test1 class");
	}
	@BeforeSuite()
	public void firstMethod() {
		System.out.println("Test1 class: Before_Suite of Test1 class");
	}
	@AfterSuite()
	public void lastMethod() {
		System.out.println("Test1 class: After_Suite of Test1 class");
	}
	
	@BeforeClass
	public void place() {
		System.out.println("Test1 class: Before_Class of Test1 class");
	}
	
	@AfterClass
	public void placeAfter() {
		System.out.println("Test1 class: After_Class of Test1 class");
	}

}
