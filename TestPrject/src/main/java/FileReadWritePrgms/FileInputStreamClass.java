package FileReadWritePrgms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamClass {

	public static void main(String[] args) throws IOException {
		InputStream in = null;
		try {
			in = new FileInputStream("/home/chethan/Documents/TestProject/abc/Resource/file1");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("number of bytes available in the input stream i.e. in file-> "+in.available());
		
		// skip() method
		System.out.println(in.skip(3)); //comment this line to understand what prints using read()

		//print all int values by converting into chat using read() method
		int ch;
		while((ch=in.read())!=-1) {
			System.out.print(ch+" ");
		}

		//int to char
		int i=121;
		System.out.println((char)i);


	}

}
