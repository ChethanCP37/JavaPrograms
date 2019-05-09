package JavaPrgms;

public class Anagram {

	/*
	 * First remove the spaces of both the strings
	 * then covert both strings to lower case
	 * then compare each letter of one array with other array 
	 * But below prgm won't work if we enter keepa and peekb, in that case use Arrays.Sort()
	 * 
	 * 
	 */

	public static void main(String[] args) {
		String str1= "keep";
		String str2 = "The Classroom";

		//Remove the spaces
		str1 =str1.replaceAll("\\s","").toLowerCase();
		str2 =str2.replaceAll("\\s","").toLowerCase();
		if(str1.length()==str2.length()) {
			for(int i=0;i<str1.length();i++) {
				for(int j=i;j<str2.length();j++) {
					if(str1.charAt(i)==str2.charAt(j)) {
					break;
					}
				}
			}
			System.out.println(str1+" and "+str2+" are Anagram");
		}
		else {
			System.out.println(str1+" and "+str2+" are not Anagram");
		}

	}

}
