package JavaPrgms;

public class StaticBlockExplanation {
	int salary;
	static String comp;
	String Design;



	public StaticBlockExplanation() {
		salary = 5555;
		Design = "XXX";
	}

	public void displayDetails() {
		System.out.println(salary+" : "+comp+" : "+Design);
	}



	public static void main(String[] args) {
		StaticBlockExplanation che = new StaticBlockExplanation();
		che.salary = 1000;
		che.Design = "QA";
		//che.comp = "Merid##ium";

		//instead of che.comp = "Merid##ium"; use StaticBlockExplanation.comp = Merid##ium
		StaticBlockExplanation.comp = "Merid##ium";

		StaticBlockExplanation sha = new StaticBlockExplanation();
//		sha.salary = 9999;
//		sha.Design = "Senior QA";
		//sha.comp = "Meridium";

		//instead of sha.comp = "Meridium"; use StaticBlockExplanation.comp = "Meridium";

		//StaticBlockExplanation.comp = "Meridium";

		//here static value will be updated with new value

		che.displayDetails();
		sha.displayDetails();

	}

}
