package JavaPrgms;

public class WrapperClass {

	public static void main(String[] args) {
		int i = 100; //primitive type
		//Integer j = new Integer(i); // autoboxing or boxing
		int j = new Integer(i);
		System.out.println("value is "+j);
		int a = j+10;
		System.out.println(a);
		//System.out.println(j.intValue());

	}

}
