package ch09_02;

public class Math1 {

	public static void main(String[] args) {
				//random 0이상 1미만 실수 0 - 44 => 1~45까지
		int[] i = new int[6];
		for(int j = 0; j < 6; j++) {
			int i1 = (int) (Math.random() * 45) +1;
			i[j] = i1;
	}
		for(int j = -0; j < i.length; j++) {
			System.out.println(":" + i[j]);
		}
	}

}
