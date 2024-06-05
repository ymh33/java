package ch11_01;

import java.util.ArrayList;

//List 계열
public class ArrayList01 {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		//중복-->구렁2(중복허용) , 순서유지
		a1.add("구렁2");
		a1.add("구렁8");
		a1.add("구렁2");
		a1.add("구렁4");
		a1.add("구렁3");
		a1.add("구렁1");
		
		for (int i =0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		System.out.println("====================================");
		for (String str : a1) {
			System.out.println(str);
		}

	}

}
