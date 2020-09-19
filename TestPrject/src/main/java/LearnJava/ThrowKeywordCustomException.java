package LearnJava;

public class ThrowKeywordCustomException {

	public static void main(String[] args) throws ThrowKeywordCustomExceptionCreation {
		validateVal(9); //Change this to more than 10
		
		try {
			validateVal(15); //This try catch will also handle exception
		}
		catch(Exception e) {
			System.out.println("Exception occured "+e);
		}
		
	  	validateVal(12); //Throw exception
	}
	static void validateVal(int i) throws ThrowKeywordCustomExceptionCreation {
		if(i>10) {
			throw new ThrowKeywordCustomExceptionCreation("Not a valid num");
		}
		else {
			System.out.println("Valid number\n");
		}
	}

}
