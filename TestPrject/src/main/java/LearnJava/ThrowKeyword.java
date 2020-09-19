package LearnJava;

public class ThrowKeyword {

	public static void main(String[] args) {
		// https://www.javatpoint.com/custom-exception
		validateNum(90);
		
	} 
	
	static void validateNum(int i) {
		if(i>10) {
			throw new ArithmeticException();
		}
		else
		{
			System.out.println("Entered value is lesser than 10");
		}
	}

}
