package ch11_01;

import java.util.Vector;

public class VectorEx02 {
	public static void vecPrint(Vector<String> vc) {
		for (String str : vc) {
			System.out.println(str + "\t");
		}
			System.out.println("\n-------------------------------------");
	}
			
		
		
		

	public static void main(String[] args) {
		Vector<String> vc = new Vector<String>();
		vc.add("수박");
		vc.add("고추");
		vc.add("수박");
		vc.add("대추");
		vc.add("오이");
		System.out.println("갯수:" + vc.size());
		vecPrint(vc);
		vc.add(1, "키위");
		vc.set(4, "봉숭아");
		vecPrint(vc);
		vc.remove(0);
		vecPrint(vc);
		
		System.out.println("2번 인덱스-->" + vc.get(2));
		System.out.println(" 수박 문의(포함여부):" + vc.contains("수박"));
		System.out.println(" 수박 문의(Index):" + vc.indexOf("수박"));
		System.out.println(" 수박 문의:" + vc.lastIndexOf("수박"));
		for (int i = 0; i < vc.size(); i++) {
			if (vc.get(i).equals("바나나")) {
				vc.set(i, "딸기");
			}
			
		}
		vecPrint(vc);
		
	}
	

	

}
