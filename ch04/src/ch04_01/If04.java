package ch04_01;

//X > 97 A+
//X > 94 A-
//else A0
public class If04 { 

	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		String grade = "";
		
		if(score >= 90) {
				if 		(score > 97) grade = "A+";
				else if (score < 94) grade = "A0";
				else 	grade = "A-"; 
		}else if 		(score >= 80) {
				if		(score > 87) grade = "B+";
				else if (score < 84) grade = "B0";
				else 	grade = "B-";
		}else if 		(score >= 70) {
			if 			(score > 77) grade = "C+";
			else if 	(score < 84) grade = "C0";
			else 		grade = "C-"; 
		}else 			grade = "F";

		System.out.println("점수" + score+ "학점은" + grade);



} }
	
