package learnAutomation;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.gargoylesoftware.htmlunit.javascript.host.fetch.Request;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class FileReadWrite extends RestAssured
{

	public static void main(String[] args) throws ParseException {
		try {
			FileInputStream fis = new FileInputStream("src/main/java/learnAutomation/File1.txt");
			int i = fis.available(); // Displays the number of bytes in file including space
			int j = fis.read(); // Read first character present in file
			System.out.println("number of bytes means number of character including space--> " + i);
			System.out.println("Display Character value of first byte in file --> " + (char) j);
			System.out.println("Display byte format of W --> " + j);
			fis.close();
			System.out.println("**************************************");

			/* Using While loop to print all values */
			FileInputStream fii = new FileInputStream("src/main/java/learnAutomation/File1.txt");
			int a;
			while ((a = fii.read()) != -1) {
				System.out.println(a + " " + (char) a);
			}
			fii.close();
			System.out.println("**************************************");

			/* Using */

			FileReader file = null;
			BufferedReader br = null;
			ArrayList<String> list = null;

			file = new FileReader("src/main/java/learnAutomation/file.json");
			br = new BufferedReader(file);
			String line = null;
			list = new ArrayList<String>();
			while ((line = br.readLine()) != null) {
				list.add(line);

			}
			System.out.println(list.toString());
			JSONParser parser = new JSONParser();
			//	        JSONArray arr=  (JSONArray) parser.parse(list.toString());
			//			System.out.println(arr);
			//			JSONObject obj = (JSONObject)arr.getJSONObject(0);

			JSONObject jsonObjectq = null;
			JsonParser json = new JsonParser();
			JsonElement array =  json.parse(new FileReader("src/main/java/learnAutomation/file.json"));       
			System.out.println("----> "+array);


			//			JSONObject json = new JSONObject(new FileReader("src/main/java/learnAutomation/file.json"));
			//			System.out.println();
			//JSONParser parser = new JSONParser();
			//			JSONObject json = (JSONObject) parser.parse(list.toString());
			//System.out.println(json.toString());
			//			System.out.println(list.get(1));
			//			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			//			Object obj = parser.parse(new FileReader("src/main/java/learnAutomation/file.json"));
			//			JSONObject jsonObject = (JSONObject) obj;	
			//			System.out.println();

			

			JsonParser parser1 = new JsonParser();
			JsonElement jsonElement = parser1.parse(new FileReader("src/main/java/learnAutomation/file.json"));
			JsonObject rootObject = jsonElement.getAsJsonObject();
			JSONObject ob = new JSONObject(jsonElement.toString());
			ob.put("name", "value1234");
			
			System.out.println("_______"+ob);
			
			RequestSpecification request=RestAssured.given();
			request.body(ob.toString());
			
		}

		catch (IOException e) {
			e.printStackTrace();

		}
	}

}
