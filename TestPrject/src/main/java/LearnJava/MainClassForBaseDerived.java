package LearnJava;

public class MainClassForBaseDerived {

	public static void main(String[] args) {
		BaseClass b = new BaseClass();
		b.print();
		b.work();
		
		BaseClass bd = new DerivedClass();
		bd.print(); // bcz of overriding
		bd.work(); 
	//	bd.show(); not possible
		

	}

}
