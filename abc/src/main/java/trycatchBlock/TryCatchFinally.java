package trycatchBlock;

public class TryCatchFinally {

	public static void main(String[] args) {
		try {
			int res=10/0;
			System.out.println(res); // Not executed
		}
		catch(ArithmeticException a) {
			System.out.println("Arithmetic exception thrown----");
		}
		finally {
			System.out.println("finally get executed irrespective of exception handled or not/ occurred or not");
		}

	}

}
