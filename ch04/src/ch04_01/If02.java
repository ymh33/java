package ch04_01;

public class If02 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]); //문자를 숫자로 만드는 매소드. 0이 첫번째 파라메터 
		int b = Integer.parseInt(args[1]); //문자를 숫자로 만드는 매소드. 1이 두번째 파라메터
		String str = args[2]; //string을 args에 넣을 시 매소드가 필요하지 않다.
		
		
		System.out.println("a->" + a); //a의 값(파라메터 확인. run config의 args값을 재사용 가능!!)
		System.out.println("b->" + b); 
		System.out.println("str"+str);
		
		if ( a > 0) {
			System.out.println(a + "는 양수");
			System.out.println("양수일");
			
		} else {
			System.out.println(a + "는 음수");
			System.out.println("음수일");
		}
		
		System.out.println("프로그램 종료");
	}

}
