package ch04_01;

public class WhileBreak01 {

	public static void main(String[] args) {
		int num = 0, sum = 0;
		while (true) { //Break를 만날 때까지 무한반복한다.
			num ++;
			sum+= num;
			if(num==5) break;
		}
		System.out.println("합계" + sum);
		System.out.println("끝");

	}

}