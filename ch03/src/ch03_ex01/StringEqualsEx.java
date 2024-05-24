package ch03_ex01;

public class StringEqualsEx {

	public static void main(String[] args) {
		String strVar1 = "김혁"; //힙 영역에 String 객체가 생성
		String strVar2 = "김혁"; //이미 존재하는 문자열을 상수로 다시 사용하면 이미 생성된 문자열 상수를 공유
		String strVar3 = new String("김혁"); //new String()을 생성하면 힙영역에 재생성함 (스택영역을 공유하고 memory의 힙영역이 다르다.)
		
		System.out.println(strVar1 == strVar2); //memory 영역을 비교하니 같다고 출력
		System.out.println(strVar1 == strVar3); //힙영역이 다르니 '주소값'이 다르다.
		System.out.println();
		System.out.println(strVar1.equals(strVar2)); //string.equals는 '데이터값'을 비교함. 같음.
		System.out.println(strVar1.equals(strVar3)); // 역시 같음. 


	}

}
