package JavaPrgms;

import java.util.Arrays;

public class AnagramUsingArraysSort {

	public static void main(String[] args) {
		String str1 ="keep baA";
		String str2 ="peek bsc";

		str1= str1.replaceAll("\\s", "").toLowerCase();
		str2= str2.replaceAll("\\s", "").toLowerCase();

		char[] ch1 = str1.toLowerCase().toCharArray();
		char[] ch2 = str2.toLowerCase().toCharArray();

				Arrays.sort(ch1); 
				Arrays.sort(ch2); 
		//		System.out.println(ch1);
		//		System.out.println(ch2);
				
				Arrays.sort(ch1);
				Arrays.sort(ch2);
	
				String s3=new String(ch1);
				String s4=new String(ch2);
				
				System.out.println(s3);
				
				if(s3.equals(s4)){
				System.out.println("Anagram");
				}
				else
				System.out.println("Not a Anagram");
	}
}
