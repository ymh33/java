package ch04_02;

import java.io.IOException;

public class WhileKeyControlEx {

	public static void main(String[] args) throws IOException {
		boolean run		= true;
		int		speed	= 0;
		int		keyCode	= 0;
		
		while(run) { //true 값으로 무한루프
			// \n과 엔터(cr)의 아스키값을 제외시킨다.
			if(keyCode !=13 && keyCode !=10) {
				System.out.println("-----------------------");
				System.out.println("1.증속  |  2.감속 | 3.중지");
				System.out.println("-----------------------");
				System.out.println("선택: ");
			}
			keyCode = System.in.read();	
				
			if (keyCode == 49) { 
				++speed; 
				System.out.println( "속도:" + speed);
			}else if (keyCode == 50) { 
				--speed; 
				System.out.println( "속도:" + speed);
			} else if (keyCode == 51) 
				break;
			
			/*while (keyCode ==13 || keyCode ==10) {
				keyCode = System.in.read();
			}
			if (keyCode == 49) { ++speed; 
			System.out.println( "속도:" + speed);
			}else if (keyCode == 50) { --speed; 
			System.out.println( "속도:" + speed);
			} else if (keyCode == 51) break;*/
						
		}
		
		System.out.println("프로그램 종료 속도0");
	}
}




			
		
	


		


		

	

