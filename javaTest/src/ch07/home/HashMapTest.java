package ch07.home;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String,String> hMap = new HashMap();
		
		hMap.put("사과", "apple");
		hMap.put("배", "ship");
		
		Set<String> keyset = hMap.keySet();
		
		for(String data:keyset);
		
		Iterator<String> keyItr = hMap.keySet().iterator();
		while(keyItr.hasNext()){
			keyItr.next();
		}
	}
}
