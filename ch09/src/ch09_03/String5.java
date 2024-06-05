package ch09_03;
//**indexOf** -> 파일이름 추출
//**substring** -> 확장자 추출
public class String5 {

	public static void main(String[] args) {
						//0123456
		String fullName = "Hello.java";
		int index = fullName.indexOf('.');//인덱스의 끝을 지정
		String fildName = fullName.substring(0, index);//0~5미만 (.)
		System.out.println("index->" +index);
		
		String ext = fullName.substring(index+1);//인덱스+1부터 끝까지
		System.out.println(fullName+"의 확장자를 제외한 이름은" +fildName);
		System.out.println(fullName+"의 확장자는" +ext);

	}

}
