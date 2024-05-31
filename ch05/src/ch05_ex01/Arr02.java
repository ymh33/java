package ch05_ex01;

public class Arr02 {

	public static void main(String[] args) {
		int[] a = new int[] { 23, 45, 67, 789, 2 };
		System.out.println("=========일반형 for 문==========");
		for (int i = 0; i < a.length; i++) {// i=인덱스, a[i]=실제값
			System.out.printf("a[%d]=%d\n", i, a[i]);

		}
		System.out.println("=========향상형 for 문==========");
		for (int kk : a) {// 배열의 타입과 동일하게 맞춰준다.
			System.out.println("kk->" + kk);
		}
	}

}
