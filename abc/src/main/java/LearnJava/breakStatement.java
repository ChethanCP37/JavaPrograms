package LearnJava;

public class breakStatement {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==2&&j==2) {
					break;
				}
				System.out.println(i+" "+j);
			}
		}

	}

}
