package ch09_03;

public class String2 {

	public static void main(String[] args) {
		char[] c = {'k', 'o', 'r', 'e', 'a'};
		String str1 = new String(c);//생성자 오버로딩
		String str2 = new String("Fighting");
		String str3 = str1 + str2;
		
		System.out.println(str3);
		System.out.println(2+1+1+5+"년");//순서대로 연산
		System.out.println("연1:"+2+1+1+5); //숫자가 문자열화
		System.out.println("연2:"+(2+1+1+5)); //()안에서 숫자연산

	}

}
