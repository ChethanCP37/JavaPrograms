package LearnJava;

import java.util.Arrays;

public class CharacterClassFunctions {

	public static void main(String[] args) {
		System.out.println("-----String to char functions-----");
		String name="ChethanCP_Kadur";
		char c = name.charAt(7); //To print character at index 7
		System.out.println(c+"\n-------------------");
		char ch[]= name.toCharArray();
		for(char cc:ch) {
			System.out.print(cc+" ");
		}
		System.out.println("\n-------------------\nto make character object");
		Character cha = new Character(c);
		char ccc= cha.charValue(); //To get char value from object
		System.out.println(ccc);

		int val =cha.compareTo('Z'); //compares C with A in unicode
		System.out.println(val);

		System.out.println("Is Digit--> "+Character.isDigit(c));
		System.out.println("Is Alphabet--> "+Character.isAlphabetic(c));
		System.out.println("Is Letter--> "+Character.isLetter(c));
		System.out.println("To lowercase--> "+Character.toLowerCase(c));

		int a[] = {1,3,5};
		int b[] = {1,3,5};
		
		boolean d= Arrays.equals(a, b);
		System.out.println(d);
		int copy[]=Arrays.copyOf(a, 6);
		copy[3]=12;
		for(int m:copy) {
			System.out.println(m);
		}
		System.out.println("-----------------");
		int z[] = {101,3,52,13,65};
		Arrays.sort(z);
		for(int q:z) {
			System.out.println(q);
		}
		
		String str =Arrays.toString(a);
		System.out.println(str);
		
		name="chethan";
		System.out.println(name);
		
	}


}


