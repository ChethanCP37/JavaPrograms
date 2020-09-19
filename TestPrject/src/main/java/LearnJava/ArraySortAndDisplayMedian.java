package LearnJava;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySortAndDisplayMedian {

	public static void main(String[] args) {
		int a[]= {19,4,87,23};
		int b[]= {33,87,101,101,2,2,1,20,20, 9};
		int len = a.length+b.length;
		int res[] = new int[len];
		
		for(int i=0;i<a.length;i++) {
			res[i]=a[i];
		}
		
		int k=0;
		for(int j=a.length+1;j<len;j++){
			res[j]=b[k];
			k++;
		}
		
		Arrays.sort(res);
		System.out.println("Sorted values are");
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}

		System.out.println("Length of array is "+res.length);
		int x=res.length/2;
		if(res.length%2==0) {
			int y= (res[x-1]+res[x])/2;
			System.out.println("4th value is "+res[x]);
			System.out.println("Median is --> "+y);
		}
		else {
			int y = res[x];
			System.out.println("Median is --> "+y);
			
		}
	}

}
