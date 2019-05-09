package JavaPrgms;

public class PrimeOrNot {

	public static void main(String[] args) {
		int x=9; int cnt=0;
		for(int i=2;i<=x/2;i++) {        
			if(x % i==0){ 
				cnt++;
				System.out.println("is not prime");
				break;
			}
			
		}
		if(cnt==0) {
			System.out.println("prime");
		}

	}
}
