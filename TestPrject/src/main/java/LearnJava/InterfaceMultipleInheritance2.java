package LearnJava;

interface Show{
	abstract void screen();
}
interface Display extends Show{
	void print();
	
}


public class InterfaceMultipleInheritance2 implements Display{

	public static void main(String[] args) {
		Display s = new InterfaceMultipleInheritance2();
		s.screen();
		s.print();

	}

	@Override
	public void screen() {
		System.out.println("ABle to show screen");
		
	}

	@Override
	public void print() {
		System.out.println("ABle to print screen");
		
	}

}
