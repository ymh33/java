package ch10_03;

public class Ex01 {
	static void method(boolean b) {
		try {
			System.out.println((1+ "b-->" +b));
			if(b) throw new ArithmeticException();
			System.out.println(2);
			//예외 발생시 실행되지 않는 문장
		} catch (RuntimeException r) {//RuntimeException은 ArithmeticException을 포괄함
			System.out.println("RuntimeException" + "--->" + 3);
			return;
		}//메서드를 빠져나간다 (finally블럭을 수행한 후에)
		catch (Exception e) {
			System.out.println(4);
			return;
		} finally {//예외 발생여부와 상관없이 항상 실행되는 문장(return을 만나면 이쪽으로옴)
			System.out.println("예외 발생 여부에 관계없이 항상 실행되는 문장" + 5);
		}
		System.out.println("정상적으로 끝나야 실행되는 문장");
	}

	public static void main(String[] args) {
		System.out.println("--true호출--");
		method(true);
		System.out.println("--false호출--");
		method(false);

	}

}
