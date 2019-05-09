package JavaPrgms;

public class NumberOfSingleCharInString {

	public static void main(String[] args) {
	String str = "my college is in bengalore";
	char val = 'z';
	int flag =0;
	char ch[] = str.toCharArray();
	for(int i=0;i<str.length();i++) {
		if(val==ch[i]) {
			flag++;
		}
	}
	if(flag==0) {
		System.out.println("e is not present");
	}
	else {
		System.out.println("e is present with "+flag+" times");
	}

	}

}
