package SeleniumTest1;

public class PomWithThisKeyword {
	int k;
	String name;
	public static void main(String[] args) {
		PomWithThisKeyword a = new PomWithThisKeyword();
		a.status();
	}
	
	public void status() {
		PomWithTestClass pom = new PomWithTestClass();
		int k=34;
		pom.valid(this);
	}
	
	public void need() {
		System.out.println("need method");
		System.out.println(k);
	}
	

}
