package learnAutomation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {

	@DataProvider
	public Object[][] getData(){
		Object[][] obj = new Object[3][2];
		obj[0][0]="Chethan";
		obj[0][1]="Kadur";
		obj[1][0]="Putta";
		obj[1][1]="Kadur";
		obj[2][0]="Asha";
		obj[2][1]="Arsikere";

		return obj;
	}
	@DataProvider
	public Object[][] getDataFromFile() throws IOException {
		FileReader file = new FileReader("src/main/java/learnAutomation/file.json");
		BufferedReader br =new BufferedReader(file);
		Object[][] data = new Object[lineCounter()][columnCounter()];
		String list=null;
		while ((list = br.readLine()) != null) {
			for(int i=0;i<2;i++) {
				data[i][0]=list;
			}
		}
		return data;
	}

	@Test(dataProvider="getData")
	public void useData(String name, String place) {
		System.out.println("Name is "+name+" and place is "+place);

	}
	@Test(dataProvider = "getDataFromFile")
	public void getFileData(String data, String data1) {
		System.out.println(data);
	}

	@Test(priority = 4)
	public int lineCounter() throws IOException {
		FileReader file = new FileReader("src/main/java/learnAutomation/file.json");
		BufferedReader br =new BufferedReader(file);
		String s=null;
		int line =0;
		while((s = br.readLine()) !=null) {
			line++;
			//System.out.println(s);
		}
		System.out.println("Line count is "+line);
		return line;
		
	}
	@Test(priority = 5)
	public int columnCounter() throws IOException {
		FileReader file = new FileReader("src/main/java/learnAutomation/file.json");
		BufferedReader br =new BufferedReader(file);
		String s=null;
		int n=0;
		while((s = br.readLine()) !=null) {
			String[] val = s.split(",");
			n=val.length;
		}
		System.out.println("Number of columns --> "+n);
		return n;
	}
	
	@Test(priority = 6)
	public int columnCounterAnotherLogic() throws FileNotFoundException {
		Scanner sc = new Scanner(new File("src/main/java/learnAutomation/file.json"));
		String s =sc.nextLine();
		System.out.println("Line data is --> "+s);
		int colCount=s.split(",").length;
		System.out.println("Column count is --> "+colCount);
		return colCount;
		
		
	}
	

}
