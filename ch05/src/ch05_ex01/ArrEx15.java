package ch05_ex01;

public class ArrEx15 {

	public static void main(String[] args) {
		if (args.length !=3) {
			System.out.println("usage : java ArrayEx15 NUM1 OP NUM2");
			System.exit(0);
		}
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[2]);
		int num [] = {num1, num2};
		int result = 0;
		char op = args[1].charAt(0); //파라매터 2번의 문자열을 문자(char)로 변환한다.
		//HW01 
		// +, -, X, / (사칙연산 수행) --> Sw문으로 수행
		// *는 .classpath를 가르키므로 X로 변경하여 사용하였다.
		//run as에 숫자 기호(OP) 숫자를 넣으면 결과값을 출력해준다.
		
		switch (op) {
		case '+' : 
			result = num[0]+num[1];
			break;
		case '-' : 
			result = num[0]-num[1];
			break;
		case 'X' : 
			result = num[0]*num[1];	
			break;
		case '/':  
			result = num[0]/num[1];
			break;
			
		default : System.out.println("지원되지 않는 형식입니다.");
			break;
		} 
		 System.out.println("결과:" + result );
		}


	}


