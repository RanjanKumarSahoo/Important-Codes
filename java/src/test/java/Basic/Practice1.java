package Basic;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Practice1 {
	
public static void getCount(String name) {
	Map<Character,Integer> count=new TreeMap<Character, Integer>();
	char strArray[]=name.toCharArray();
	for(char c:strArray) {
		if(count.containsKey(c)) {
			count.put(c, count.get(c)+1);
		}else {
			count.put(c, 1);
		}
	}
	System.out.println(name+" "+count);
}
public static void main(String[] args) {
	getCount("aaabbddccfffeeehhhgggiiijjhh");
}
	
}

