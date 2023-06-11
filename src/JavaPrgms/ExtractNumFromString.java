package JavaPrgms;

public class ExtractNumFromString {

	public static void main(String[] args) {
		String s1="Str4ig23hdsdf5tnesd9cy9";
		String s2="";
		
		String spl[] = s1.split("[a-zA-Z]");
		for(String s:spl) {
			System.out.println(s.trim());
			s2=s2+s.trim();
			System.out.println(s2);
		}
		//System.out.println(s2);
		
		//Another Way of doing
		String str = "Str4ig23hdsdf5tnesd9cy9";
		
		char ch[] =str.toCharArray();
		
		for(int i=0; i<str.length();i++) {
			Character c = new Character(ch[i]);
			
			if(c.isDigit(c)) {
				System.out.println(c);
			}
		}
	}

}
