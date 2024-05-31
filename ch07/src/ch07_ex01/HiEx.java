package ch07_ex01;
//재귀함수 숙제
class D1 {
	String hellow = "안녕, 나야!!!";
	int result = 1;
	void hi (int cnt) {
		if (cnt > 0) {
			result *= cnt;
			System.out.println(hellow +" cnt -->" +cnt);
			hi(--cnt);		
		}
		else {
			System.out.println(hellow +" cnt -->" +cnt);
			System.out.println();
			return;
		}
	}
			
}

public class HiEx {

	public static void main(String[] args) {
		D1 d = new D1();
		d.hi(6);
	}


}
