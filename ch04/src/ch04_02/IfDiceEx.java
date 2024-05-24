package ch04_02;

public class IfDiceEx {

	public static void main(String[] args) {
					// Math.random :0.0 <= X <1.0 의 double값을 랜덤하게 생성해준다. 
		int num = (int)(Math.random()*6) + 1;
		
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		} else if(num==2) {
			System.out.println("2번이 나왔습니다.");
		}else if(num==3) {
			System.out.println("3번이 나왔습니다.");
		}else if(num==4) {
			System.out.println("4번이 나왔습니다.");
		}else if(num==5) {
			System.out.println("5번이 나왔습니다.");
		}else if(num==6) {
			System.out.println("6번이 나왔습니다.");
		}
	}

}
