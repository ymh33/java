package ch07_ex01;

class StaticM {
	int num = 0;
	
	void display() {
		num ++;
		System.out.println("메롱 num->" + num);
	}
	
	static void print(String str) {//static void 선언
		//num ++;
		System.out.println("대박 수요일" + str);
		//static Method는 static 변수만 사용 가능
		//static void는 인스턴스를 선언하지 않아도 사용이 가능하다
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		
		StaticM.print("인스턴스 전");
		
		StaticM sm = new StaticM();
		
		sm.display();
		sm.display();
		sm.display();
		sm.display();
		sm.print("인스턴스 후");

	}

}
