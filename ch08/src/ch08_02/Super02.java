package ch08_02;

class C1 {
	C1() {
		System.out.println("매개변수 없는 부모 생성자");
	}
	C1(String str) {
		System.out.println("매개변수 있는 부모 생성자 1 str" + str);
	}
	void cc1Method() {
		System.out.println("cc1 야호! 목요일이다");
	}
}
class C2 extends C1 {
	C2() {
		super("헐~~~"); //매개변수 1개짜리 부모 생성자 호출
		System.out.println("매개변수 없는 자식 생성자");
	}
	void cc1Method() {
		System.out.println("C2 야호 목요일이다");
	}
	void cc2Method() {
		System.out.println("cc2 자식 Method cc2");
	}
}
public class Super02 {

	public static void main(String[] args) {
		
		C2 c = new C2();
		c.cc2Method();
		c.cc1Method();

	}

}
