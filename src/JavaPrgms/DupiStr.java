package JavaPrgms;

import java.util.LinkedHashSet;
import java.util.Set;

public class DupiStr {
public static void main(String argu[]) {

 String str = "w3schoolssc";
 int cnt = 0;
 char[] inp = str.toCharArray();
 System.out.println("Duplicate Characters are:");
 for (int i = 0; i < str.length(); i++) {
  for (int j = i+1; j < str.length(); j++) {
   if (inp[i] == inp[j]) {
    System.out.println(inp[j]);
    cnt++;
    Set<Integer> s = new LinkedHashSet<>();
    
    break;
   }
  }
 }
 System.out.println("Count of repeated values is > "+cnt);
}
}