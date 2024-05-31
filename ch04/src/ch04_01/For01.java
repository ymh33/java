package ch04_01;

public class For01 {

	public static void main(String[] args) {
		int sum = 0;
		//Process
		//1) 1.int=1 / 2.i<=10 --> {}
		//2) 1.i++ / 2. i<=10 --> {} (Logic이 끝날때까지) 
		for (int i = 1; i <= 10; i ++) {
			sum += i;
			System.out.println(i + "까지의 합:" + sum);
		}
		System.out.println("합계:" + sum);

	}

}
