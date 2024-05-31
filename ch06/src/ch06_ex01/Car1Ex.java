package ch06_ex01;

class Car1 {
	//Member 변수(=필드)
	String color; //공유변수(메모리 공유X)
	static int speed; //static이 붙으면 공유변수+Class변수(메모리 공유O)
	//static 변수는 인스턴스화 하지 않아도 사용할 수 있는 변수
	//static 변수는 객체 선언 없이 사용 가능하다. (메모리 공유함)
	
	void print() {
		System.out.println("색깔 :" + color);
		System.out.println("속도 :" + speed);
		System.out.println("---------------------");
	}
}

public class Car1Ex {

	public static void main(String[] args) {
		Car1.speed = 130;
		// 선언       생성
		Car1 c1 = new Car1(); //인스턴스 변수(1)
		Car1 c2 = new Car1(); //인스턴스 변수(2) 설계는 같지만 다른 인스턴스다. 메모리 공유X
		
		c1.print();
		c1.color = "빨강";
		c1.speed = 200;
		c2.color = "노랑";
		
		c1.print();
		c2.print();
	}

}
