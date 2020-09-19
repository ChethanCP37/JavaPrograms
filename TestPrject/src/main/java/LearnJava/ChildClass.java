package LearnJava;

public class ChildClass extends BaseClass {
	int j=20;
	public void check() {
		System.out.println("check the status");
	}

	public void validation() {
		System.out.println("Validation ");
	}

	public static void main(String[] args) {
		BaseClass b = new ChildClass(); // work and print are base class methods
		b.work();
		b.print();
		
		ChildClass c = new ChildClass();
		c.work();
		c.print();
		c.check();
		c.validation();
		
		ChildClass cb = (ChildClass)b;
		cb.work();
		cb.check();
	}
}
