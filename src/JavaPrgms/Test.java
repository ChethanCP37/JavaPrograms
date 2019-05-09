package JavaPrgms;

public class Test {

//Output : 12,18,24,30,,,,,,,
	public static void main(String[] args) {
		int i=1000;
		for(i=4;i<=10;i*=6) {
			System.out.println("Value "+i*3);
		}
		
//Print all capital letters	
		for(char i1='A';i1<='Z';i1++) {
			System.out.print(i1+" ");
		}
		
//Print the ASCII value of given num
		char ch ='z';
		int val = ch;
		System.out.println("\nASCII value of "+ch+ "is "+val);

//Prime or not: 1 is prime, any num which will divided by itself and 1 is prime
		int numbr=17;
		int cnt=1;
		for(int k=2;k<=numbr/2;k++) {
			if(numbr%k==0) {
				cnt++;
				System.out.println(numbr+" not a prime num");
				break;
			}
		}
			if(cnt==1) {
				System.out.println(numbr+" prime num");
		}

		
		
		
	}
}
