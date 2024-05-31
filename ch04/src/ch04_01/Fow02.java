package ch04_01;

import java.io.IOException;

//for로 구구단 완성하기
public class Fow02 {

	public static void main(String[] args) throws IOException {
		System.out.println("보고싶은 구구단 숫자는");
		int num = System.in.read() - '0';;
		int i = 1;
		
		if (num >= 2 && num <= 20) {
			for (i = 1; i <= 9; i++) {
				System.out.println(num + "*" + i + "=" + num*i );
			}
			}else {
				System.out.println("구구단에 없는 숫자입니다.");
		}
	}
}
			