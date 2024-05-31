package ch06_ex01;
//작동
public class CarEx {

	public static void main(String[] args) {
	  //객체 선언(Instance)=  생성
		Car myCar = new Car();
//--------------------------------------
		Car yourCar; //객체명 Reference 변수명
		yourCar = new Car();//생성
		
		myCar.color = "빨강"; //속성값
		myCar.speed = 200; //속성값
		yourCar.color = "초록"; //속성값
		yourCar.speed = 150; //속성값
		myCar.speedUP();
		myCar.print();		//Method
		yourCar.print();   //Method
	
	}

}
