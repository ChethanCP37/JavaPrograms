package GeneralJavaPrgms;

import java.util.ArrayList;
import java.util.List;

public class MakePalindromeOrNot {

	public static void main(String[] args) {
		String str = "qqa";

		List<Character> list = new ArrayList<Character>();

		for(int i=0;i<str.length();i++) {
			if(list.contains(str.charAt(i))) {
				list.remove((Character)str.charAt(i));
			}
			else {
				list.add((Character)str.charAt(i));
			}
		}

		if((list.size()==1 || list.size()==0) && str.length()>1) {
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
	
	

}
