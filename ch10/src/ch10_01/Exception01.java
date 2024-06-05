package ch10_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception01 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			System.out.println("첫 번째 값을 입력하세요 =>");
			int num1 = Integer.parseInt(bin.readLine());
			System.out.println("두 번째 값을 입력하세요 =>");
			int num2 = Integer.parseInt(bin.readLine());
			System.out.println(num1+ "/" +num2+ " = " + num1/num2);
		}

	}

}
