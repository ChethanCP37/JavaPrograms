package GeneralJavaPrgms;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReadWordsFromTxt {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/GeneralJavaPrgms/test.txt");
//		Scanner sc = new Scanner(fis);
		InputStreamReader isr = new InputStreamReader(fis);
		
		BufferedReader br = new BufferedReader(isr);
		
		String line=null;
		String[] res=null;
		while((line=br.readLine()) != null) {
			res = line.split("/");
			System.out.println(res[0]);
			System.out.println(res[1]);
			System.out.println(res[2]);
		} 
	}

}
