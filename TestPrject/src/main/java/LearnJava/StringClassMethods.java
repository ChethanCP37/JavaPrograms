package LearnJava;

public class StringClassMethods {

	public static void main(String[] args) {
		String s= "i am in kadur";
		String name="cheTHanAsha";
		String str =" Asha   ";
		
		//charAt
		char c=name.charAt(0);
		System.out.println(c);
		
		//length()
		int len = name.length();
		System.out.println(len);
		
		//equal
		System.out.println(s.equals(name));
		
		//concat
		System.out.println(name.concat(str));
		
		//contains
		System.out.println(name.contains(str)); // we can use (name.contains(str.trim()));
		
		//equalsIgnoreCase
		System.out.println(name.equalsIgnoreCase("CHETHANASHA"));
		
		//subString(int i)
		System.out.println(name.substring(2));
		
		//subString(int i, int j)
		System.out.println("subString(int i, int j) "+name.substring(2,4));

		//intern() -- Create a exact copy in string constant pool
		System.out.println(name.intern());
		
		//replace 
		System.out.println(name.replace(c,'@'));
		
		//split
		String arr[]=s.split(" ");
		for(String split:arr) {
			System.out.print(split+" ");
		}
		
		//or 
		String sVal= arr[1];
		System.out.println("\n"+sVal);
		
		//indexOf()
		int cc= s.indexOf("a");
		System.out.println(cc);
		
		//toUpperCase
		System.out.println(name.toUpperCase());
		
		//toLowerCase
		System.out.println(name.toLowerCase());
		
		//trim()
		System.out.println(str.trim());
		
	}

}
