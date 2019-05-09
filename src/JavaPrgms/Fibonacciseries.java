package JavaPrgms;

public class Fibonacciseries {

	public static void main(String[] args) {
		int j,n=10,t1=0,t2=1,sum=0;
		for(int i=1;i<=n;i++) {
			System.out.println(t1);
			sum=t1+t2;
			t1=t2;
			t2=sum;
		}

	}

}
