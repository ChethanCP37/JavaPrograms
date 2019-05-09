package JavaPrgms;

public class ReverseLetters_Without_Inbulid_Fun {

	public static void main(String[] args) {
		String s = "This is a java Prgm";
		char ch[]=s.toCharArray();
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(ch[i]);
		}

	}

}
