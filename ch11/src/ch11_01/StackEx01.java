package ch11_01;

import java.util.Stack;

public class StackEx01 {

	public static void main(String[] args) {
		String[] pet = {"지렁이", "굼벵이", "애벌레", "구렁이"};
		Stack<String> st = new Stack<String>();
		for(String str : pet) {
			System.out.println("push-->" + str);
			st.push(str);
		}
		System.out.println("-----------------------------------");
		while(!st.isEmpty()) {
			System.out.println("POP==>" +st.pop());
		}
		System.out.println("POP st->" +st); //POP은 메모리를 삭제해가므로 이 값은 비어있음[]

	}

}
