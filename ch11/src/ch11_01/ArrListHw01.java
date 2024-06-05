package ch11_01;

import java.util.ArrayList;
import java.util.List;

public class ArrListHw01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("JDBC");
		list.add("Database");
		list.add("Servlet/JSP");
		list.add("iBaTIS");
		
		int size = list.size();
		System.out.println("총 객체 수:" +size);
		System.out.println("List : " +list);
		//2째 인덱스 가져와 출력
		System.out.println("2번째 인덱스:" +list.get(2));
		System.out.println();
		list.remove(2);
		list.remove(3);
		list.remove(2);
		for (int i = 0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
