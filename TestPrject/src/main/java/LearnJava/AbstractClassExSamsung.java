package LearnJava;

abstract class Mobile {
	abstract void call();	//abstract method
	abstract void videoCall();	//abstract method

	void msg() {	// Concrete method or non abstract method
		System.out.println("msg");
	}

	Mobile(){	//Constructor of abstract class Mobile
		System.out.println("TurnOn mobile- constructor mobile");
	}

}
abstract class AbstractClassXi extends Mobile {

	@Override
	void call() {
		System.out.println("Samsung call");

	}

	void record() {
		System.out.println("Record the call");
	}
}
public class AbstractClassExSamsung extends Mobile {

	@Override
	void videoCall() {
		System.out.println("Main method video call");

	}

	@Override
	void call() {
		System.out.println("Main method normal call");

	}

	public static void main(String[] args) {
		Mobile m = new AbstractClassExSamsung();
		m.call();
	}


}

