package ch08_01;

public interface Lenderable {//추상메소드(모두 상수로 들어감!!)
	int BORROW = 1;
	int NORMAL = 0;
	void checkOut(String borrower, String data);
	void checkin();

}
//추상메소드를 상속(implements)받아서 구현해줌, 구현 객체에서는 변수선언 가능
class SeperateVolume implements Lenderable {
	String title;
	String data;
	String borrower;
	int status;
	
	SeperateVolume(String title) {
		this.title = title;

	}
	//책 대여 메소드(상태가 normal일때만 책 대여 가능)
	public void checkOut(String borrower, String data) {
		if (status != NORMAL) return;
		this.data = data;
		this.borrower = borrower;
		status = BORROW;
		System.out.println(borrower+ "가" +data+ "일에" +title+ "을 대여했다.");

	}
	@Override //책 반환 메소드
	public void checkin() {
		if (status != BORROW) return;
		System.out.println(borrower+ "가" +data+ "일에" +title+ "을 반납했다.");
		data = null;
		title = null;
		borrower = null;
		status = NORMAL;
		
	}

}
