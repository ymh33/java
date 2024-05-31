package ch06_ex01;
//주차요금 Class
public class Car3 {
	String name;
	int inTime; //입고시간
	int outTime; //출고시간
	int fee; 	//주차요금
	final int AMRPERTIME = 3000; //시간당요금(final변수(상수))
	// OverLoading(한 클래스 내의 똑같은 이름의 생성자가 하나 이상(단, 파라메터 갯수나 변수가 달라야함))
	public Car3() {
		//기본 생성자는 메모리만 할당
	}
	//생성자(=constructor), 메모리 할당, member변수를 초기화해준다. 
	public Car3(String n, int inTime, int out) {
		this.name = n;
		this.inTime = inTime; //this.를 붙여서 멤버변수와 파라메터를 구분해줌
		this.outTime = out;
	}
	void print() {
		int fee = (outTime - inTime) * AMRPERTIME;
		System.out.println("차  이름:" + name);
		System.out.println("입고시간:" + inTime);
		System.out.println("출고시간:" + outTime);
		System.out.println("주차요금:" + fee);
		System.out.println("------------------------------");
	}

}
