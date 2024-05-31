package ch05_ex01;

public class ArrTest3 {
	//합계와 평균 최대값 최소값 구하기
	public static void main(String[] args) {
		int array[] = {76, 45, 34, 89, 100, 50, 90, 92};
		int sum = 0, avg = 0, max = 0, min = 100;
		
		for(int i =0; i < array.length; i++) {
			sum += array[i];
			if (array[i] > max) max = array[i];
			if (array[i] < min) min = array[i];			
		}
		avg = sum/array.length;
		System.out.println("합계=" + sum + "평균=" + avg);
		System.out.println("최대값=" + max + "최소값=" + min);

	}

}
