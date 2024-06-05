package ch11_03;

import java.util.HashMap;

public class HashMapEx01 {

	public static void main(String[] args) {
		HashMap<String, String> hm01 = new HashMap<String, String>();
		//Key Value
		//1. Key 중복허용  X
		//2. Value  중복허용 O
		hm01.put("이승우", "2222");
		hm01.put("손흥민", "3333");
		hm01.put("전지현", "4455");
		hm01.put("전지현", "3456");
		hm01.put("전지현3", "3456");
		
		System.out.println("이승우  TEL:" +hm01.get("이승우"));//Key를 주면 Value가 튀어나옴
		System.out.println("손흥민  TEL:" +hm01.get("손흥민"));
		System.out.println("전지현  TEL:" +hm01.get("전지현"));
		System.out.println("전지현  TEL:" +hm01.get("전지현3"));
	}

}
