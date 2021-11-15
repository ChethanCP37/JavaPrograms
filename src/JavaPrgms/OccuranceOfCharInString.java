package GeneralJavaPrgms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OccuranceOfCharInString {

	public static void main(String[] args) {
		String n= "licious@delicious";
		char ch[]=n.toCharArray();

		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(Character c:ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		System.out.println("Gives key set : "+map.keySet());


		System.out.println("Gives value set : "+map.values());

		for(Character cp: map.keySet()) {
			System.out.println(cp+" present for --> "+map.get(cp)+" times");

		}
		System.out.println("\n");



		int val=map.get('i'); 
		System.out.println(val);// display the count of occurance of the value

		System.out.println("Print map"+map); // it display occurance of values in flower brackets

		System.out.println("Occurance of characters and its number of times  \n: "+map.entrySet());


		//using getKey and getValue methods
		Set<Entry<Character, Integer>> values=map.entrySet();
		for(Entry<Character, Integer> vv:values) {
			if(vv.getValue()>2) {
				System.out.println(vv.getKey()+" present "+vv.getValue()+" times");
			}
			//			char c=vv.getKey();
			//			int va=vv.getValue();
			//			System.out.println(c+" --> "+vv); 
		}

		//Using only map.get() 
		Set<Character> set =map.keySet();

		for(Character cc: set) {
			if(map.get(cc)>2) {
				System.out.println(cc+" present for "+map.get(cc)+"times");
			}
		}
	}
}
