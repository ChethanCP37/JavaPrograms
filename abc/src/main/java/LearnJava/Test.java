package LearnJava;

import java.util.*;

public class Test {
	public static void main(String[] args){
		int a[]= {1,1,5,8,1,7,5,11,11,11,11,4,8,1,10,11,100,101};
		List<Integer> list = new ArrayList<Integer>(); 
		Set<Integer> hs = new HashSet<>(); 

		for(int i=0;i<a.length;i++) {
			int k=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j] && i!=j) {
					k++;
				}
			}
			if(k==0) {
				hs.add(a[i]);
				System.out.println(a[i]);
				list.add(a[i]);

			}
		}
		System.out.println("----------------");
			System.out.println(list);
		
		System.out.println("----------------");
		System.out.println(hs+ " ");
	}
}