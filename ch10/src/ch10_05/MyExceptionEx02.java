package ch10_05;

public class MyExceptionEx02 {
	// 1.최소급여
	// java MyExceptionEx02 num1
	// 사장님 100만원 보다 적어요 !! 이 뭡니다
	// 2.최대급여
	// java MyExceptionEx02 num1
	// 사장님 1000만원 넘 많아요 , 좀 적당히 합시다

	// 3.정상급여
	// java MyExceptionEx02 num1
	// 정상실행.
	// 4.잘못된 수행
	// java MyExceptionEx02 num1
	// 실행 매개값의 수가 부족합니다.
	// [실행 방법]
	// java MyExceptionEx2 num1
	

	public static void main(String[] args) {
		System.out.println("java MyExceptionEx2 num1");
		try {
			int num1 = Integer.parseInt(args[0]);
			if (num1 < 100)
				throw new MyExceptionEx02_01();
			else if (num1 > 1000)
				throw new MyExceptionEx02_02();
			else
				System.out.println("정상실행. 급여는" + num1);

		} catch (MyExceptionEx02_01 e) {
			System.out.println(e.getMessage());
		} catch (MyExceptionEx02_02 e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행방법]");
			System.out.println("java MyExceptionEx2 num1");
		} catch (Exception e) {
			System.out.println("잘못된 수행입니다.");
		}

	}

}
