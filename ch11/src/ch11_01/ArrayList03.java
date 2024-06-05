package ch11_01;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList03 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("바나나");
		list.add("귤");
		list.add("오렌지");
		list.add("바나나");
		//List는 배열과 비슷하지만 다름. 내부적으로 원소의 집합이다.
		System.out.println("요소의 개수 ->" + list.size());
		System.out.println(">>Iterator 객체로 요소 얻기<<");
		Iterator<String> element = list.iterator();
		while(element.hasNext()) //요소가 있다면 반복
			System.out.print(element.next()+"\t");//요소를 얻어내어 출력함
		System.out.println("\n");
		
		System.out.println(">>get 메소드로 요소 얻기<<");
		for(int i= 0; i<list.size(); i++)
			System.out.print(list.get(i)+"\t");
		System.out.println();
		
	}

}
