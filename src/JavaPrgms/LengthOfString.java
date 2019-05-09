package JavaPrgms;

public class LengthOfString {

	public static void main(String[] args) {
		String str="chethancp";
		char ch[]=str.toCharArray();
		int i=0;
		for(char val:ch) {
			i++;
		}
		System.out.println(i);
	}

}
