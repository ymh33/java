package ch05_ex01;

public class ArrTest01 {
//2차원 배열
	public static void main(String[] args) {
		int a[][] = {{1,2,3,4,5}, //a의 1행 1~5열
					{11,12,13,14,15},//a의 2행 1~5열
					{21,22,23,24,25}//a의 3행 1~5열
					};
		for (int i=0; i<a.length; i++) {//i값이 커지면서 행 증가
			for(int j=0; j<a[i].length; j++) {//j값이 커지면서 열 증가
				System.out.print(a[i][j]+" \t");
			} //inner for
			System.out.println();
			
		}
		//out for
	}

}
