package JavaPrgms;

// Task from Keerti -- output should be mgrp avaj a si sihT and we should not use inbuild methods
public class ReverseLettersOfWords {
	public static void main(String[] args) {
		String s = "This is a java Prgm ";
		//String str[] = s.split(" "); //Split is inbuild method

		String st1 = "";
		for(int i=0;i<s.length();i++) {
			st1 = st1+s.charAt(i);
			if(s.charAt(i)==' ') {
				char ch[] = st1.toCharArray();
				for(int j=st1.length()-1;j>=0;j--) {
					System.out.print(ch[j]);
					st1="";
				}
			}

		}
		Integer i =12;
		System.out.println(i);
		System.out.println("\n"+i.toString());

	}
	


}


