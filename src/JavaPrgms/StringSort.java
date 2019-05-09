package JavaPrgms;

import java.util.ArrayList;
import java.util.Arrays;

public class StringSort {

	public static void main(String[] args) {
		String s1="apufvbxzeyc";
		//String s1="945629856381";
		char ch1[] = s1.toCharArray();
		//			Arrays.sort(ch1);
		//			System.out.println(ch1);
		char temp;
		for(int i=0;i<s1.length();i++) {
			for(int j=i+1;j<s1.length();j++) {
				if(ch1[i]>ch1[j]) {
					temp =ch1[i];
					ch1[i]=ch1[j];
					ch1[j]=temp;
				}

			}
		}
		System.out.println(ch1);
		

	}

}
