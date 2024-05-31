package ch04_01;

public class ForContinue {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i ++) {
			System.out.println("대박 i =" + i);
			if ( i > 5) continue; //continue를 만나면 아래 코드는 실행하지 않고 조건으로 돌아간다.
			System.out.println("쪽박 i =" + i);


	}

}
}
