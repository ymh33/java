package ch02_ex02;

public class ConcatEx {
	public static void main(String[] args) {
		String str1 = "num=" + 3 + 4; //문자열로 결합
		String str2 = 3 + 4 + "=num"; //숫자가 먼저 더해짐
		System.out.println("str1->"+str1);
		System.out.println("str2->"+str2);
		
	}
}
