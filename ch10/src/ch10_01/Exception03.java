package ch10_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception03 {

	public static void main(String[] args) {
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			System.out.println("첫 번째 값을 입력하세요 =>");
			try {
				int num1 = Integer.parseInt(bin.readLine());
				System.out.println("두 번째 값을 입력하세요 =>");
				int num2 = Integer.parseInt(bin.readLine());
				System.out.println(num1+ "/" +num2+ " = " + num1/num2);
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력해야 합니다");
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다");
			} catch (Exception e) { //에러의 범용적 처리
				System.out.println("값을 확인해주세요");
			}

		}

	}

}
