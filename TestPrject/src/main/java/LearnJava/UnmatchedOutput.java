package LearnJava;

import java.util.ArrayList;
import java.util.Arrays;

public class UnmatchedOutput {
	String ss[] = new String[2];
	public static void main(String[] args) {
		String str1="XYXXXFDX";
		String str2="XSAABD";
		UnmatchedOutput u = new UnmatchedOutput();
		System.out.println("first set "+u.returnValues(str1,str2));
		System.out.println("second set "+u.returnValues(str2,str1));
	}
	public String returnValues(String in1, String in2) {

		char s[] = new char[9];
		int k=0;
		for(int i=0;i<in1.length();i++) {
			for(int j=0;j<in2.length();j++) {
				if(in1.charAt(i)==in2.charAt(j)) {
					s[k]=in1.charAt(i);
					k++;
				}
			}
			
		}
//		System.out.println(s[0]+" "+s[1]+" "+s[2]+" "+s[3]);
//		System.out.println(k)	;	
		String res = null;
		for(int l=0;l<k;l++) {
		//System.out.println(s[0]+"AAA--> "+s[1]+ " BB-->"+s[2]);
		String str = Character.toString(s[l]);
//		System.out.println("Value "+l+" "+str);
		in1=in1.replace(str, "");
//		System.out.println("res "+l+" "+in1);
//		System.out.println("-----------------------");
		}
		return in1;

	}
}



