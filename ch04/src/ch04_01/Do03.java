package ch04_01;

import java.util.Scanner;



public class Do03 {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int cnt = 0, num;
	int answer = (int) (Math.random()*100)+1; // 1~100정수
	do {
		System.out.println("1~100 중 어떤 숫자일까요?");
		num = sc.nextInt(); //int형태로 값을 받는다
		
		if(answer == num) {
			System.out.println("정답입니다. 컴퓨터의 숫자:" + num +" "+ cnt + "번에 맞췄습니다."); break;
			
		}else if (answer < num) { System.out.println("컴퓨터의 숫자보다 큽니다.");
		}else if (answer > num){ System.out.println("컴퓨터의 숫자보다 작습니다.");
		} cnt ++;
		System.out.println();
		
		System.out.println("num->");
	}while (true); 

}
}
