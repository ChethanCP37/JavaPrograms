package JavaPrgms;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateValues {

	public static void main(String[] args) {
		int a[] = {1,2,3,5,3,7,3,5,3};
		Set<Integer> set= new LinkedHashSet<Integer>(); //Set won't allow duplicate values
		int k=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					set.add(a[i]); 
				}
			}
		}
		System.out.println("Duplicate values are : "+set);
	}
}
