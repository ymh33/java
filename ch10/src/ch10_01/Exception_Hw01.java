package ch10_01;
//예외처리 숙제
import java.util.Scanner;

public class Exception_Hw01 {

	public static void main(String[] args) {
		int result = 0;
		int num1 = 0;
		int num2 = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			try {
				System.out.println("첫번째 숫자 입력하세요");
				num1 = Integer.parseInt(sc.nextLine());
				if (num1 == 0) break;
				System.out.println("두번째 숫자 입력하세요");
				num2 = Integer.parseInt(sc.nextLine());
				result = num1 / num2;
				System.out.printf("%d / %d = %d\n", num1, num2, num1/num2);
				
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다");
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력하세요");
			} catch (Exception e) {
				System.out.println("입력을 확인하세요");
			}
			
		} while(true);
		
		System.out.println("프로그램 종료");
		sc.close();

	}

}
