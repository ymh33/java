package ch06_ex01;

public class Car3Ex {

	public static void main(String[] args) {
		//Car3 car0 = new Car3()//메모리만 초기화
		Car3 car1 = new Car3("소나타", 10, 14);//메모리+인스턴스변수 초기화
		Car3 car2 = new Car3("다마스", 9, 20);
		Car3 car3 = new Car3("모닝", 12, 13);
		
		//car0.name = "소나타"; //Car3()안에 들어가는 변수 초기화
		
		car1.print();
		car2.print();
		car3.print();
	
	}

}
