package LearnJava;

public class SwitchStatement {

	public static void main(String[] args) {
		String value="5";
		int num =1;
		
		switch(value) {
		case "5": num=0;
			System.out.println("value 5");
			break;
		case "10":num=1;
			System.out.println("value 10");
		break;
		case "15":num=2;
			System.out.println("value 15");
			break;
		default:num=3;
			System.out.println("Entered value is incorrect");
			break;
		}
	}
}
