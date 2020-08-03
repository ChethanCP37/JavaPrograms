package LearnJava;

abstract class Test123 {
	abstract void run();

}

public class Polymorphism extends Test123 {
	void run() {
		System.out.println("Abstarct method concept");
	}
	
	public static void main(String[] args) {
		Test123 t= new Polymorphism();
		t.run();
	}
	
}

