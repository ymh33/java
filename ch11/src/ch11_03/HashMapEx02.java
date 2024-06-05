package ch11_03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx02 {

	public static void main(String[] args) {
		HashMap<String, String> hm01 = new HashMap<String, String>();
		//Key Value
		//1. Key 중복허용  X
		//2. Value  중복허용 O
		hm01.put("이승우", "2222");
		hm01.put("손흥민", "3333");
		hm01.put("전지현", "4455");
		
		Set<String> st = hm01.keySet();
		for(String str : st) {
			System.out.println(str+"의 전화[Set]-->" + hm01.get(str));
		}

		Iterator<String> it = hm01.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key +"의 전화" + hm01.get(key));
		}
	}

}
