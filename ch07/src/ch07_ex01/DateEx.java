package ch07_ex01;

//Call By Value && Call By Reference ***중요***

class Date {
	int kor;
	int eng;
	int math;
	//Call By Reference //객체값을 넘긴다
	void addRef (Date d1, Date d2) {//void :리턴값 없음
		d1.kor = d2.eng;
		System.out.println("Method국어 점수 :" + d1.kor);
	}
	//CallByValue 리턴타입(int)+리턴할 매소드명(addkor)+파라메터(int kor)
	int addkor(int kor) { //프리미티브값을 넘긴다
		kor += 10;
		System.out.println("kor=>"+kor);
		return kor;
	} 
	
}
public class DateEx {

	public static void main(String[] args) {
		//확보공간의 주소를 가지고 있다
		Date d1 = new Date();
		Date d2 = new Date();
		Date d3 = new Date();
		int d3_kor = d3.addkor(10); //데이터를 넘겨주는 효과(CallByValue)
		//return을 써서 객체의 데이터(변수타입) 하나를 가져옴 
		System.out.println("d3_kor->"+d3_kor);
		d1.kor = 50;
		d1.math = 70;
		d2.eng = 80;
		//**중요**인스턴스를 넘겨주면 메모리 주소값을 넘겨주는 효과(주소값 참조. CallByRef)
		//void 사용해야함. 객체의 모든 데이터(의 주소)를 가져온다.
		d3.addRef(d1, d2);
		System.out.println("Main 국어 점수:" + d1.kor);

	}

}
