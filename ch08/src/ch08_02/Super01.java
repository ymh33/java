package ch08_02;

class S1 {
	int a = 7;
	int b = 7;
	void display () {
		System.out.println("B1 대박");
	}
	void print() {
		System.out.println("B1 난 부모 print 메소드");
	}
}

class S2 extends S1 {
	int a = 10;
	void print() {
		super.print(); //부모메소드 찾음
		System.out.println("B2 부모멤버 a="+super.a);
		System.out.println("B2 난 자식 메소드 a="+a);//this가 생략됨
		System.out.println("B2 난 자식 메소드 b="+b);
		System.out.println("======================");
	}//상속을 받으면 자식 메소드가 우선, 없으면 아버지 메소드를 찾음
	//super멤버변수는 부모 클래스에 접근한다는 의미. 부모의 멤버변수와 자식의 멤버변수를 구별해준다
}
public class Super01 {

	public static void main(String[] args) {
		S2 b = new S2();
		b.print();
		b.display();

	}

}
