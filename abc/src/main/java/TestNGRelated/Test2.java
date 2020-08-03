package TestNGRelated;

import org.testng.annotations.Test;

public class Test2 {
	
	@Test
	public void asha() {
		System.out.println("Asha");
	}
	@Test
	public void chethan() {
		System.out.println("Chethan");
	}
	@Test(groups= {"SmokeTest"})
	public void chethanSwaroop() {
		System.out.println("ChethanSwaroop");
	}

}
