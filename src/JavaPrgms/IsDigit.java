package JavaPrgms;

public class IsDigit {

	public static void main(String[] args) {
		String s ="smdfbjwhwe48sdsvf83bc9463wjdcc98";
				for(int i=0;i<s.length();i++) {
					if(Character.isDigit(s.charAt(i))) {
						System.out.println(s.charAt(i)+" is digit");
					}	
					else {
						System.out.println(s.charAt(i)+" is not a digit");
					}
				}

//		char ch[]=s.toCharArray();
//		Character ch1 = new Character(ch[1]);
//		System.out.println(ch1.toString());		
	}

}
