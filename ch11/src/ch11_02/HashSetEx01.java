package ch11_02;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx01 {

	public static void main(String[] args) {
		//set은 순서 비유지, 중복을 허용하지 않음
		HashSet<String> hs = new HashSet<String>();
		hs.add("구렁2");
		hs.add("고양이");
		hs.add("야옹이");
		hs.add("구렁2");
		hs.add("진도개");
		hs.add("멍멍이");
		
		for(String str : hs) {
			System.out.println(str);
		}
		System.out.println("======= Advanced ========");
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
