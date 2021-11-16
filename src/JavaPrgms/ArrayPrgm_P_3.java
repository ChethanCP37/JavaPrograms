package GeneralJavaPrgms;


import java.util.ArrayList;

public class ArrayPrgm_P_3 {

	public static void main(String[] args) {
		
		// when p=2, displayed values should be last two digits and when p = 3, displayed values should be last 3 digits
		int a[]= {1,3,6,34,23,78,9};
		ArrayList<Integer> ar = new ArrayList<Integer>();
		int p=2;

		for(int i=a.length-1;i>(a.length-p-1);i--){
			System.out.println(a[i]); // output is 9 78


		}
	}
}
