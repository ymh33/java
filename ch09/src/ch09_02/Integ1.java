package ch09_02;

public class Integ1 {

	public static void main(String[] args) {
		String str = "3";
		//모두 문자열을 정수로 변환해주는 메소드
		//1.Integer.parseInt()는 결과값을 기본 자료형(Primitive Type)인 int 로 반환
		//2. Integer.valueOf()는 문자열의 값을 정수형으로 변환한 뒤 참조 자료형(Reference Type)인 
		//Integer 객체로 만들어서 반환
		int i1 = Integer.parseInt("3");
		Integer i2 = Integer.valueOf("3");
		
		System.out.println(i1 + i2);
		System.out.println(str + str);


	}

}
