package LearnJava;

public class PassingArrayToMethod {
	
	public static void main(String[] args) {
		int a1[]= {21,56,34,1,98};
		m(a1);
	}
	static void m(int a[]) {
		for(int j:a) {
			System.out.println(j);
		}
	}
}
