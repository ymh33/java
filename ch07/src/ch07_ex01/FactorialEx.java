package ch07_ex01;

import java.util.Scanner;

//재귀함수(자기자신을 재호출하는 함수)
class Fac1 {
	int result = 1;
	void factorial(int cnt) {
		if (cnt > 1) {
			result *=cnt;
			System.out.println(cnt + " * ");
			factorial(--cnt);
		}
		else {
			System.out.println( cnt  );
			System.out.println("Factorial 결과는 " + result);
			return;
		}
	}
}
public class FactorialEx {

	public static void main(String[] args) {

		Fac1 e = new Fac1();
		int InNum ;
		System.out.println("Factorial 할 10이하의 숫자를 입력하세요 :");
		Scanner sc = new Scanner(System.in);
		InNum = sc.nextInt();
		e.factorial(InNum);
	}

}
