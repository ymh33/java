package ch11_03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExHw01 {

	public static void main(String[] args) {
		//Map컬렉션 생성
		Map<String, String> map = new HashMap<String, String>();
		//객체 저장
		map.put("신용균", "80");
		map.put("홍길동", "95");
		map.put("신용권", "85");
		
		System.out.println("총 Entry 수: " +map.size());
		System.out.println(map);
		System.out.println("신용균의 어쩌구"+map.get("신용균"));
		
		Set<String> st = map.keySet();
		for(String str : st) {
			System.out.println(str + ":" + map.get(str));
		}
		
		

		

	}

}
