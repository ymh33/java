package ch06_ex01;

class Subscribe {
	public String name;//기본 설정
	private String telnum;//private 접근제어자(동일 클래스 내부에서만 접근가능, 보안용):캡슐화
	Subscribe(String n, String t) {
		name = n;
		telnum = t;
		
	}
	Subscribe(String n) {
		name = n;
		
	}
	void ChgTelNum(String t) {//private
		telnum = t;
	}
	void print() {
		System.out.printf("이름 : %s 전화번호 : %s \n", name, telnum);
	}
}
public class SubscribeEx {

	public static void main(String[] args) {
		Subscribe s1 = new Subscribe("이성계", "010-2223-5567");
		Subscribe s2 = new Subscribe("김유신");
		s1.print();
		s2.print();
		s2.ChgTelNum("02-344-7788");
		s2.print();

	}

}
