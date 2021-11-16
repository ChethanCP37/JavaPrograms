package GeneralJavaPrgms;

public class Palindrome {

	public static void main(String[] args) {
		String name= "jhgfdj";
		boolean flag=false;
		
		for(int i=0;i<(name.length()/2);i++) {
			if(name.charAt(i)!=name.charAt(name.length()-1-i)) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("Not a palindrome");
		}
		else {
			System.out.println("palindrome");
		}

	}

}
