package nikeeta;

import java.util.HashMap;
import java.util.Set;

public class Itinerary {
	public static String getStart(HashMap<String,String> map) {
		HashMap<String,String> rev = new HashMap<>();
		for(String key: map.keySet()) {
			rev.put(map.get(key), key);
		}
		//System.out.println(rev);
		
		for(String key:map.keySet()) {
			if(!rev.containsKey(key)) {
				return key;
			}
		}
		return null;
		
	}
public static void main(String args[]) {
	HashMap<String,String> h = new HashMap<>();
	h.put("c", "b");
	h.put("m", "d");
	h.put("g", "c");
	h.put("d", "g");
	
	String s = getStart(h);
	while(h.containsKey(s)) {
		System.out.print(s+" -> " +"");
		s = h.get(s);
		
	}
	//System.out.println(s);
	
}
}
