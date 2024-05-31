package ch07_ex01;

class SingleTon {
	String str;
	//private static SingleTon instance = new SingleTon();
	private static SingleTon instance; //반드시 static
	private SingleTon() {//반드시 private
		//같은 클래스 내의 메소드만 사용할 수 있는 생성자
	} 
	public static SingleTon getInstance() {
		if (instance == null) instance = new SingleTon();
		return instance;
	}
	}

public class SingleTonEx {

	public static void main(String[] args) {
		
		SingleTon st1 = SingleTon.getInstance();
		SingleTon st2 = SingleTon.getInstance();
		st1.str = "넌 누구";
		System.out.println(st2.str);
		if (st1 == st2) System.out.println("같다");
		else System.out.println("다르다");
	}

}
