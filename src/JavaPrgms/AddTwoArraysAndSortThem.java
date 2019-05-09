package JavaPrgms;

import java.util.Arrays;

public class AddTwoArraysAndSortThem {
	static int a[] = {2,56,21,13};
	static int b[] = {15,4,17,43};
	static int n=a.length;
	static int m=b.length;
	static int res[]= new int[n+m];
	public static void main(String[] args) {
		int k=0;
		for(int i=0; i<n; i++) {
			res[i]=a[i];
			k++;
		}
		for(int j=0;j<m;j++) {
			res[k+j]=b[j];
		}
		Arrays.sort(res);
		System.out.println("Sorted array is");
		System.out.println("Length of array res[] is "+(n+m));
		for(int l=0;l<(n+m);l++) {
		System.out.println(res[l]);
		}
		
	}

}
