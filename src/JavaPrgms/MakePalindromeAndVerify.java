package JavaPrgms;

public class MakePalindromeAndVerify {

	public static void main(String[] args) {
		String st="kkiri";
		int[] f = new int[123];
		char[] chArray = st.toCharArray();

		for(char ch:chArray) {
			f[ch]++;
			System.out.println("Value "+f[ch]);
		}
		int cnt=0;
		for(int ch:f) {
			if(ch % 2 != 0) 
				cnt++;
		}
		System.out.println(cnt);
		if(cnt>1) {
			System.out.println("palindrome can't be formed "+st);
		}
		else {
			System.out.println("palindrome can be formed "+st);
		}
	}
}
