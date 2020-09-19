package trycatchBlock;

public class TryCatch3 {

	public static void main(String[] args) {
		try {
			int res=12/0;
			System.out.println("inside try block");
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic Exception thrown");
			int val=20/0; //exception occur
			System.out.println(val); //not be executed
		}
		System.out.println("Rest of code"); //As exception occurred at catch block, 
		//rest of code won't be executed

	}

}
