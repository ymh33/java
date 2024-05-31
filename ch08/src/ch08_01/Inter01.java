package ch08_01;

//-----------------------------------------
//인터페이스는 
//1) 양식의 역할-->표준화
//2) 다중상속 지원
//3) **class와class를 연결해준다**

public interface Inter01 {//추상메소드. 모두 상수
	int AA = 3;
	void display();
	void print();
}

class D1 implements Inter01 {

	@Override
	public void display() {
		System.out.println("재정의 했음....AA->" +AA);
		
	}

	@Override
	public void print() {
		System.out.println("나도야 간다");
		
	}
	
}