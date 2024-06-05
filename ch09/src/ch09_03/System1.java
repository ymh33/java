package ch09_03;

public class System1 {

	public static void main(String[] args) {
		//자바의 환경변수를 가져옴
		String path = System.getenv("path");
		//자바 변수 중에 JAVA_HOME만 확인하기
		String java_home = System.getenv("JAVA_HOME");
		System.out.println(path);
		System.out.println(java_home);
		
	}

}
