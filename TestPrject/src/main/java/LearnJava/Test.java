package LearnJava;

//filename: Test2.java 
class Test1 { 
	Test1(int x) { 
		System.out.println("Constructor called " + x); 
	} 
} 

//This class contains an instance of Test1 
class Test {	 
	Test1 t1 = new Test1(10); 

	Test(int i) { t1 = new Test1(i); } 

	public static void main(String[] args) {	 
		Test t2 = new Test(5); 
	} 
} 

