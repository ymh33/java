package ch08_01;

//추상 Class
abstract class C1 {
	int k;
	public C1() {
		System.out.println("추상Class 생성자 ");
	}
	void setK(int k) {
		this.k = k;
	}
	 //하나 이상의 추상 메소드가 존재해야 함
	//메소드 정의만 있는 것이 메소드
	abstract void print();
}
class C2 extends C1{

	@Override
	void print() {
		System.out.println("C2 k->");
		
	}
	void print3() {
		System.out.println("C2 pirnt3 k->");
	
}

public class OverRide03 {

	public static void main(String[] args) {
		//C1 c1 = new C1(); 
		//추상메소드만 있으면 인스턴스화 할 수 없다
		//추상Class는 생성 안됨 -> 하나 이상의 추상Method를 가졌기 때문
		C1 c1 = new C2();
		c1.setK(12);
		c1.print();
		//c1.print3();
		
		C2 c2 = new C2();
		c2.setK(7);
		c2.print();
		c2.print3();

	}
}

}
