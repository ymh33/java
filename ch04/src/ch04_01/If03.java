package ch04_01;
//숙제02
public class If03 {

	public static void main(String[] args) {
		//1. If03 수행시 파라메타를 하나받음(점수)
		//int score = 0; //파라메타 값을 score에 넣기
		//2. score를 if문 수행 
		//	1) 90 >= X 		grade = "A";
		//	2) 80<= X < 90 	grade = "B";
		//	3) 70<= X < 80 	grade = "C";
		//	4) ELSE		 	grade = "F";
		int score = Integer.parseInt(args[0]);
		String grade = "";

		
		/*if (90 <= score) {
			grade = "A";
		} else if (80 <= score) {
			grade = "B";
		} else if (70 <= score) {
			grade = "C";
		} else {
			grade = "F";
		} System.out.println("점수 " + grade);*/
		
		//바람직한 답

				if 		(score >= 90) 	grade = "A";
				else if	(score >= 80) 	grade = "B";
				else if	(score >= 70) 	grade = "C";
				else					grade = "F";			

	}

}

