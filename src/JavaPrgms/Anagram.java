package GeneralJavaPrgms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		boolean status = true;
		String str1= "keep";
		String str2 = "peeK";

		//Remove the spaces and convert to lower case
		str1 =str1.replaceAll("\\s","").toLowerCase();
		str2 =str2.replaceAll("\\s","").toLowerCase();

		//If length of given two words are not same then it's not anagram
		if(str1.length()!=str2.length()) {
			status = false;
		}

		char ch[] = str1.toCharArray();
		char ch1[] = str2.toCharArray();

		Arrays.sort(ch);
		Arrays.sort(ch1);

		for(int i=0;i<str1.length();i++) {
			if(ch[i]!=ch1[i]) {
				status=false;
				break;
			}
		}

		if(status) {
			System.out.println(str1+" and "+str2+" are Anagram");
		}
		else {
			System.out.println(str1+" and "+str2+" are not Anagram");
		}
	}
}
