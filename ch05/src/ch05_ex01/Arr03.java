package ch05_ex01;

public class Arr03 {

	public static void main(String[] args) {
		String[] str = {"산토끼", "고양이", "판토끼", "강아지"};
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		System.out.println("====향상된 for문====");
		for (String kk : str) {
			System.out.println(kk);
		}

	}

}
