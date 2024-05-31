package ch06_ex01;

	
class Card {
	String kind; //인스턴스 변수
	int number;
	
	static int width = 100; //클래스 변수
	static int height = 250;
	
	
	public Card() {
	}
	public Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
}

public class CarTest01 {

	public static void main(String[] args) {
		//객체 1 생성 --> 기본 생성자
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		System.out.print("c1:" + c1.kind + "," + c1.number);
		System.out.print("\n c1:" + c1.width + "," + c1.height);
		//객체 2 생성 --> 생성자 (메모리 + 인스턴수 변수 초기화)
		Card c2 = new Card("Spade", 4);
		System.out.print("\n c2:" + c2.kind + "," + c2.number);
		System.out.print("\n c2:" + c2.width + "," + c2.height);
		
	}

}
