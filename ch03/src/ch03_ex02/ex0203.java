package ch03_ex02;
// 숙제 01
public class ex0203 {

	public static void main(String[] args) {
		int pencils = 534;
		int stutdents = 30;
		
		//학생 한 명이 가지는 연필 수
		int pencilsPerStudent = pencils / stutdents;
		System.out.println("학생 한 명이 가지는 연필 수 는 " + pencilsPerStudent);
		
		//남은 연필 수
		int pencilsLefs = pencils % stutdents ;
		System.out.println("학생이 가지고 남은 연필 수 " + pencilsLefs);
	}

}
