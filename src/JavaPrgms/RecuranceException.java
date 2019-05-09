package JavaPrgms;

public class RecuranceException {

	//To throw StackOveFlowError
	public static void main(String[] args) {
		create();
	
	}
	public static void create() {
		update();
	}

	public static void update() {
		create();
	}
}
