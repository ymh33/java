package ch04_01;

public class Do01 {//Do-while문은 while문에 비해 오류를 수정하기 좋다.)
	//Do-while문은 while문과 달리 최초의 1회 코드는 실행되고 조건 검증을 아래 위치한(while)에서 한다.
	//Do-while문이 좀 더 권장되는 반복문의 형태이다.

	public static void main(String[] args) {
		int sum = 0, i = 1;
		do {
			sum += i;
			i++;
		} while( i <= 10 );
		System.out.println("합계 : " + sum);

	}

}
