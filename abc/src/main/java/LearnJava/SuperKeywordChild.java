package LearnJava;

public class SuperKeywordChild extends SuperKeywordParent{

	String colour="BLACK";
	public void window() {
		System.out.println("SuperKeywordChild class window method");
	}
	public void calling() {
		System.out.println("-->"+super.colour); //Calling parent class colour
		super.window(); //Calling parent class method
		
	}
	public static void main(String[] args) {
		SuperKeywordChild sC= new SuperKeywordChild();
		sC.calling();
		System.out.println(sC.colour);
		sC.window();

	}

}
