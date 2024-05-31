package ch05_ex01;

public class ArrayTest5 {

	public static void main(String[] args) {
		String[] m = { "이름", "국어", "영어", "수학", "총점", "평균" };
		String[] name = { "김준수", "이하이", "안예은", "국카스텐" };
		int[][] score = { { 80, 70, 90 }, { 70, 90, 90 }, { 80, 70, 80 }, { 90, 90, 70 } };
		int[] tot = new int[3];
		int sum = 0, avg = 0, totSum = 0, totAvg = 0;
		System.out.println("성적표 \n");
		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i] + "\t");
		}
		System.out.println("\n--------------------------------------------");

		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]);
			sum = 0;
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				avg = sum / score[i].length;
				tot[j] += score[i][j]; // j=과목에 대한 총계
				System.out.print("\t" + score[i][j]);
			}
			System.out.println("\t" + sum + "\t" + avg);
		}

		System.out.println("\n--------------------------------------------");
		System.out.print("총계");

		for (int j = 0; j < tot.length; j++) {
			totSum += tot[j];
			System.out.print("\t" + tot[j]);
		}
		totAvg = totSum / (score[0].length * name.length);
		System.out.print("\t" + totSum + " " + "\t" + totAvg);

	}
}
