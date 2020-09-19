package LearnJava;

public class Finbnoci {

	public static void main(String[] args) {
		int n0=0,n1=1,res;
		System.out.println("Fibnoci series --> "+n0);
		for(int i=0;i<10;i++) {
			res=n1+n0;
			n0=n1;
			n1=res;
			System.out.println(res);
		}
	}
}
