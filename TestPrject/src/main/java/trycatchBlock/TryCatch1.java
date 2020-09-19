package trycatchBlock;

public class TryCatch1 {

	public static void main(String[] args) {
		try {
			int res=25/0;
			System.out.println("try block"); //This code is not executed
		}
		catch(ArithmeticException e){
			System.out.println(e);
			System.out.println("Exception handled inside catch block");
			/*Instead of System.out.println(e) we can write custom msg
			 * like "Exception handled inside catch block"
			 */

		}
		System.out.println("rest of the code");

	}

}
