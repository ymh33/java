package ch06_ex01;

//설계도
public class Car {
	//Member 변수(=필드)
	String color;
	int speed;
	
	//행위 --> Method (영문자 또는 &로 시작) 두번째부터 숫자 가능
	void speedUP() {
			speed++;
			System.out.println(speed + "속도를 올렸다.");
			
		}
		
	void print() {
		System.out.println("색깔 :" + color);
		System.out.println("속도 :" + speed);
	
	}

}
