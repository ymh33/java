package ch02_ex02;

//Study : Final의 개념 이해하기
public class FinalEx {

	public static void main(String[] args) {
		final double PI = 3.14; // final(=상수) 선언시 대문자 사용
		double raedius = 2.0, circum;
		
		// PI++ 상수를 가공하려고 하면 오류가 발생함
		
		circum = 2 * PI * raedius;
		System.out.println(circum);

	}

}
