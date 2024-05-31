package ch05_ex01;

public class Arr01 {

	public static void main(String[] args) {
		int[] a = new int[5];
		a[0] = 7;
		a[1] = 34;
		a[2] = 67;
		a[3] = 6;
		a[4] = 234;
		int[] b = new int[5];
		b[0] = 7;
		b[1] = 34;
		b[2] = 67;
		b[3] = 6;
		b[4] = 234;
		System.out.println("a.length->"+a.length);
						//a배열의 사이즈를 지정
		for(int i = 0; i < a.length; i++) {//i=인덱스, a[i]=실제값
			System.out.printf("a[%d]=%d\n", i, a[i]); //최적화(%d사용)
		}
		for(int i=0; i < b.length; i++) {
			System.out.println("b["+i+"]="+b[i]); //풀어서 작성
		}
		


	}

}
