package JavaPrgms;

public class TryCatchException {

	public static void main(String[] args) {
		sum(10, 0);
		System.out.println();

	}
	static void sum(int i, int j) {
		int res=0;
		try {
			 res = i/j;
		}
//		catch(ArithmeticException e) {
//			System.out.println("entered values are not valid");
//			//res = i/j;	//exception
//			System.out.println("######123");
//		}
		finally {
			System.out.println("######");
			res =i/j; //exception
			
			System.out.println("Test11");
			
			
		}
		System.out.println("Test ");
		
		
		
		
	}

}
