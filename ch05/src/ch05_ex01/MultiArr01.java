package ch05_ex01;

public class MultiArr01 {

	public static void main(String[] args) {
		int [][] a = new int [2][3];
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 11;
		a[1][1] = 12;
		a[1][2] = 13;
		
		for (int i = 0; i < a.length; i++) { //행2
			for (int j = 0; j < a[i].length; j++) {
				//System.out.println("일반 For a ["+i+]{"+j+]="a[i][j]);
				System.out.print("일반 For " + a[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("============향상 For===============");
		for (int[] k1 : a) { //a[0], a[1] (행 증가)
			for (int k2 : k1 ) { //행 안의 열 증가
			
			System.out.print("향상 For " + k2 + "\t");
			}
			System.out.println();
		}
	}
}
	