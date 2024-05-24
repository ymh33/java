package ch04_03;

import java.io.IOException;
import java.util.Scanner;

public class ex0302 {

	public static void main(String[] args) throws IOException {
		boolean run = true;
		int balance = 0; //잔액
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1.예금  | 2.출금  | 3.잔고  |  4.종료");
			System.out.println("----------------------------------");
			System.out.println("메뉴를 골라주세요:");
			int menuNum = scanner.nextInt();
			int money = 0;

			// menuNum ->1
			// 1) balance = balance +예금액
			// menuNum ->2
			// 2) balance = balance - 예금액
			// menuNum ->3
			// 3) 잔고 조회를 콘솔에 보여줌
			// menuNum ->1
			// 4) while 종료 (run = false)
			switch (menuNum) {
				case 1: 
					System.out.println("예금액을 입력하세요:");
					money = scanner.nextInt();
					balance = (balance + money); 
					break;
				case 2:
					System.out.println("출금액을 입력하세요:");
					money = scanner.nextInt();
					balance = (balance - money); 
					break;
				case 3:System.out.println("잔고:" + balance);
					break;
				case 4: System.out.println("프로그램 종료");
					run = false;
					break;

			default : System.out.println("올바른 메뉴를 골라주세요.");
			break;
			}
		}
	}
}