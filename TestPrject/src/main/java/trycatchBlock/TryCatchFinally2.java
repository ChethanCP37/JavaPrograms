package trycatchBlock;

public class TryCatchFinally2 {

	public static void main(String[] args) {
		try {
			int res=10/0;
			System.out.println(res);
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally get executed irrespective of exception handled or not/ occurred or not ");
		}
	}

}
