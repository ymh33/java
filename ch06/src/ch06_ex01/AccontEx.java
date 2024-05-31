package ch06_ex01;

import java.util.Scanner;

class Account {
	String account; //계좌번호
	String name; //계좌주
	int balance; //잔액
	
	public Account(String acc, String n, int bal) {
		account = acc;
		name = n;
		balance = bal;
	}
	//예금
	void deposit(int amt) {
		balance += amt;
		System.out.println(name+ "이"+ +amt+"만큼 예금했습니다.");
	}
	
	//인출
	void withdraw(int amt) {
		if (balance < amt) {
			System.out.println(name +"이" +amt+"만큼 출금 시도");
			System.out.println(name + "잔고 부족 ");
		}
		else {
			balance -= amt;
			System.out.println(name + "이" + amt +"만큼 출금했습니다");
		}
	}
	//계좌 잔액 조회
	void perBalance() {
		System.out.println(name + "의 현재 잔액은 " + balance);
	}
}
public class AccontEx {

	public static void main(String[] args) {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		String user = null;
		String user1 = "이성계";
		String user2 = "강감찬";
		
		Account ac1 = new Account("신한1", "이성계", 1500);
		Account ac2 = new Account("국민2", "강감찬", 7000);
		
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1.예금  | 2.출금  | 3.잔고  |  4.종료");
			System.out.println("----------------------------------");
			System.out.println("메뉴를 골라주세요:");
			int menuNem = scanner.nextInt();
			switch (menuNem) {
			case 1: 
				System.out.println("이름을 입력해주세요:");
				user = scanner.next();
				if (user.equals(user1)) {
					System.out.println("예금액을 입력하세요:");
					int amt = scanner.nextInt();
					ac1.deposit(amt);				
				}
				if (user.equals(user2)) {
					System.out.println("예금액을 입력하세요:");
					int amt = scanner.nextInt();
					ac2.deposit(amt);
				}
				break;
			case 2:
				System.out.println("이름을 입력해주세요:");
				user = scanner.next();
				if (user.equals(user1)) {
					System.out.println("인출액을 입력하세요:");
					int amt = scanner.nextInt();
					ac1.withdraw(amt);				
				}
				if (user.equals(user2)) {
					System.out.println("인출액을 입력하세요:");
					int amt = scanner.nextInt();
					ac2.withdraw(amt);
				}
				break;
			case 3:
				System.out.println("이름을 입력해주세요:");
				user = scanner.next();
				if (user.equals(user1)) {
					ac1.perBalance();				
				}
				if (user.equals(user2)) {
					ac2.perBalance();	
				}			
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