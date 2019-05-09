package JavaPrgms;

import java.util.ArrayList;

public class ArrayPrgm_P_3 {

	public static void main(String[] args) {
		int a[]= {1,3,6,34,23,78,9};
		ArrayList<Integer> ar = new ArrayList<Integer>();
		int p=2;

		for(int i=a.length-1;i>(a.length-p-1);i--){
			System.out.println(a[i]);


		}
System.out.println(a[1]);
	}
}
