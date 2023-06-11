package JavaPrgms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateIntUsingCollections {

	public static void main(String[] args) {
		int a[]= {1,56,23,1,6,7,23,1,56,6,1,234,999};
		
		Map<Integer,Integer> map = new HashMap<>();
		for(Integer i: a) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}else {
				map.put(i, 1);
			}
		}
		Set<Integer> set=map.keySet();
		//System.out.println(map.keySet());
		for(Integer v:set) {
			if(map.get(v)>1) {
				System.out.println(v+" repeated "+ map.get(v));
			}
		}
		
		//We can use  entrySet also to display data as below 
				for(Entry<Character, Integer> m : map.entrySet()){
			Character c1 =m.getKey();
			Integer i1 = m.getValue();
			
			System.out.println(c1+" present for "+i1+" times");
		}
	}
}
