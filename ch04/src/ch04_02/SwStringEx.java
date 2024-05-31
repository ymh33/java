package ch04_02;
//숙제 :
public class SwStringEx {

	public static void main(String[] args) {
		String position = args[0];
		//부장 -> 700만원
		//과장 -> 500만원
		//그외 -> 300만원
		switch (position) {
		case "부장" : System.out.println("부장 700만원"); break;
		case "과장" : System.out.println("과장 500만원"); break;
		default : System.out.println("그외 300만원"); break;
		}

	}

}
