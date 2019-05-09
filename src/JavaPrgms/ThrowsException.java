package JavaPrgms;

public class ThrowsException {

	public static void main(String[] args) {
		
		checkEligibility(10,20);

	}
	
	public static void checkEligibility(int stuAge, int stuWeight) {
		if(stuAge<12 && stuWeight<30) {
			throw new ArithmeticException("Student is not eligible" );
		}
		else {
			System.out.println("Student is eligible");
		}
		
	}
	
	

}
