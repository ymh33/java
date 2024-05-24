package ch02_ex02;

//Study : 연산자의 위치에 따라 달라지는 값 학습하기 
public class IncEecEx {

	public static void main(String[] args) {
		int num1 = 5, num2 = 5, num3 = 5, num4 = 5;
		int result1 = num1++; 
		int result2 = num2--; 
		int result3 = ++num3; 
		int result4 = --num4; 

		
		System.out.println("result1 =" + result1);
		System.out.println("result2 =" + result2);
		System.out.println("result3 =" + result3);
		System.out.println("result4 =" + result4);
		System.out.println("result5 =" + result3);
		result3--;
		System.out.println("result6 =" + result3++);
		System.out.println("result3 =" + result3);
		
		int result5 = num1++; 
	
		


	}

}
