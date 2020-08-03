package TestNGRelated;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void testing1() {
		System.out.println("testing_1 method");
	}
	@Test(priority=-1,enabled=true, groups={"SmokeTest","RegressionTest"}) // priority=0 will eun testing1 method first then testing2
	public void testing2() {
		System.out.println("testing_2 method exe.... 000");
	}
	@Test(groups="FuntionTest")
	public void placeMethod() {
		System.out.println("testing_3 method");
	}
	@BeforeSuite()
	public void lastMethod() {
		System.out.println("method last");
	}

}
