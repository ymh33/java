package ch07_ex01;
//숙제 Overload 이용하기
class OverLoad {
	int num;
	String str;
	void print() {
		System.out.println("매개변수 없다");
	}
	void print(int num) {
		System.out.println("매개변수 한개 int =" +num);
	}
	void print(String str) {
		System.out.println("매개변수 한개 str =" +str);
	}
	void print(String str, int num) {
		System.out.println("매개변수 두개 int+str ["+str+ "] int=" +num);
	}
	
}

public class OverLoadingEx {

	public static void main(String[] args) {
		OverLoad ol = new OverLoad();
		ol.print();
		ol.print(12);
		ol.print("대박");
		ol.print("금요일", 16);

	}

}
