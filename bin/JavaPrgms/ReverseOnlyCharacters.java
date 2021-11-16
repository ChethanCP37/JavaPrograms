package GeneralJavaPrgms;

public class ReverseOnlyCharacters {

	public static void main(String[] args) {
		String str = "C@He!!)(th*a^N.";
		char ch[] = str.toCharArray();

		for(int i=ch.length-1;i>=0;i--) {
			if(Character.isLetter(ch[i])){
				System.out.println(ch[i]);
			}
		}

		//OR

		System.out.println("********************************");

		for(int i=ch.length-1;i>=0;i--) {
			if(65<=ch[i] && ch[i]<=90 || 97<=ch[i] && 122>=ch[i]){
				System.out.println(ch[i]);
			}
		}
	}
}
