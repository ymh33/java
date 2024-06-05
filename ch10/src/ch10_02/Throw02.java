package ch10_02;

public class Throw02 {

	public static void main(String[] args) {
		int num = 100, result = 0;
		//이런 상황이 발생하면
		//try-catch나 throws를 이용해준다
		for(int i = 0; i < 10; i++) {
			int ran = (int)(Math.random()*10);
			result = num / ran;
			System.out.println("나눗셈 결과" + result);
		}

	}

}
