package ch07_ex03;

public class Computer {
	int sum1(int[] values) {
		int sum = 0;
		
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	
	int sum2(int ... values) {//가변변수. 배열처럼 잡힘. 편해서 권장
		int sum = 0;
		System.out.println("values->" +values);
		
		for(int i=0; i<values.length; i++) {
			System.out.println("values[i] ->" +values[i]);
			sum += values[i];
	
		}
		return sum;
		}
}
	
		

