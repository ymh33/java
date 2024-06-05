package ch11_01;

import java.util.ArrayList;

public class ArrayList02 {

	public static void main(String[] args) {
		//중복--> (중복허용) , 순서유지
		ArrayList<String> list = new ArrayList<String>();
		list.add("수박");
		list.add("사과");
		list.add("바나나");
		list.add("수박");
		list.add("대추");
		list.add("바나나");
		System.out.println("갯수: " + list.size());
		//System.out.println("list" + list); <-자바17에서는 데이터값을 보여주지만 버전이 낮으면(해시값나옴) 메서드가 필요할수있음
		devPrint(list);
		//1번 자리에 끼워넣기 가능
		list.add(1, "키위");
		devPrint(list);
		//4번 자리에 교체
		list.set(4, "봉숭아");
		devPrint(list);
		//0번을 삭제(뒤에건 당겨짐)
		list.remove(0);
		devPrint(list);
		System.out.println("3번 인덱스->" + list.get(3));
		System.out.println("바나나 문의" + list.contains("바나나"));
		System.out.println("바나나 문의" + list.indexOf("바나나"));
		System.out.println("바나나 문의" + list.lastIndexOf("바나나"));
		for (int i =0; i<list.size(); i++) {
			if(list.get(i).equals("바나나")) {
				list.set(i, "딸기");
			}
		}devPrint(list);
	}

	private static void devPrint(ArrayList<String> list) {//리스트를 순차적으로 불러오는 메서드 작성
		for (String str : list) {
			System.out.print(str + "\t");
		}
		System.out.println("\n--------------------------------------------------------");
		
	}

}
