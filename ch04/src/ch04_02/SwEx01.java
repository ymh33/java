package ch04_02;
// 실습 IfDiceEx를 SwitchEx01로 Conversion(바꾸기)
public class SwEx01 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6);
		
		switch (num) {
			case 1 :
				System.out.println("1이 나왔습니다.");
				break;
			case 2 :
				System.out.println("2이 나왔습니다.");
				break;
			case 3 :
				System.out.println("3이 나왔습니다.");
				break;
			case 4 :
				System.out.println("4이 나왔습니다.");
				break;
			case 5 :
				System.out.println("5이 나왔습니다.");
				break;
			default :
				System.out.println("6이 나왔습니다.");
				break;
		}
	}

}
