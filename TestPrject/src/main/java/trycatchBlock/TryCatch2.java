package trycatchBlock;

public class TryCatch2 {

	public static void main(String[] args) {
		
		try {
			int arr[]=new int[5];
			arr[7]=8/0; //Arthmetic exception occurs first then ArrayIndex... exception
			System.out.println("try block rest code"); //Won't execute as exception occurs
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("rest of code");
		/* Here we need to identify which error will generate first 
		 * Arithmetic exception occurs first then ArrayIndexOutOfBound 
		 * Exception, but we have not handled Arithmetic exception so
		 * remaining lines of code not executed and JVM throws Arithmetic 
		 * exception 
		 */	
	}

}
