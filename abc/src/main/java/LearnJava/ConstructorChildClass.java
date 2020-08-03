package LearnJava;

public class ConstructorChildClass extends ConstructorParentClass {

	ConstructorChildClass(){
		super("name"); // or super();
		System.out.println("__________");
	}
	public static void main(String[] args) {
		new ConstructorChildClass();
	}
}
