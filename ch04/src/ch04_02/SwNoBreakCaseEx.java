package ch04_02;
//숙제 : switch(time)을 이용해서 8시 출근, 9시 회의, 10 업무, 나머지 외근, break 없이 나머지 일정 모두 출력
public class SwNoBreakCaseEx {

	public static void main(String[] args) {
		//8 <= ... 12 < 12(8+4) 사이의 정수 얻기 --> random
		int time = (int)(Math.random()*4) + 8;
		System.out.println("[현재시간 [" + time + "시]]");

	}

}
