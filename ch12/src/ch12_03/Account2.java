package ch12_03;

public class Account2 {
	int total; //계좌금액
	Account2 (int total) {
	this.total = total;
	}
	void deposit(int amt, String name) {
		total += amt;
		System.out.println(name + "예금:" + amt);
	}//synchronized 사용시 동시 접근을 막는다.
	void withdraw(int amt, String name) {
		if (amt <= total) {
			total -= amt;
			System.out.println(name + "출금: " +amt);
		} else {
			System.out.println(name+ "의 출금 요청" +amt +"잔액부족 저금좀 해 --> 현재 잔액" +total);
		}
	}
	void getTotal() {
		System.out.println("잔액: " + total);
	}
}
