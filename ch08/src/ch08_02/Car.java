package ch08_02;

public class Car {
	String kine;
	Engine eg; //객체를 멤버변수로 선언 가능
	public Car(String kine, Engine eg) {
		this.kine = kine;
		this.eg = eg;
	}
	
	void print() {
		System.out.println("종류: " +kine);
		eg.print();
		System.out.println("==============");
	}

	public static void main(String[] args) {
		
		Engine eg1 = new Engine("알파엔진", 2000);
		Engine eg2 = new Engine("델타엔진", 3000);
		
		Car[] c = new Car[3];
		c[0] = new Car("소나타", eg1);
		c[1] = new Car("모닝", eg1);
		c[2] = new Car("벤츠", eg2);
		for( Car c1 : c) {
			c1.print();
		}

	}

}
