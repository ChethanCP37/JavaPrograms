package SeleniumTest1;

//This class is used as reference to PomWithThisKeyword
public class PomWithTestClass {
	int i=1;
	
	public void check() {
		System.out.println("inside check method");
	}
	
	public void valid(PomWithThisKeyword pomWithThisKeyword) {
		System.out.println("inside valid method with this keyword");
		pomWithThisKeyword.k=12;
		pomWithThisKeyword.need();
	}
}
