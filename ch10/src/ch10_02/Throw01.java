package ch10_02;

public class Throw01 {

	public static void main(String[] args) {
		System.out.println("안녕");
		Exception e1 = new Exception("내가 에러 만들었다");

		try {
			System.out.println("e1 1");
			throw e1;
			//System.out.println("출력 안됨 언이치에이블);
			
		} catch (Exception e2) {
			System.out.println(e2.getMessage()+"kkk");
		}
		System.out.println("프로그램이 정상 종료되었음");


	}

}
