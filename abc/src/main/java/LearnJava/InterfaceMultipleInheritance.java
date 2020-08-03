package LearnJava;

interface Showable{
	void print(); // even if we don't mention abstract, this method is declared as abstract
	public static final int MIN = 0; //Data members are public static and final by default
}
interface Printable{
	abstract void print();
	abstract void open();
}
public class InterfaceMultipleInheritance implements Printable,Showable {

	public static void main(String[] args) {
		Printable s = new InterfaceMultipleInheritance();
		s.print();
		s.open();
	}

	@Override
	public void print() {
		System.out.println("print");
	}

	@Override
	public void open() {
		System.out.println("open");

	}

}
