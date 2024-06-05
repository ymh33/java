package ch09_04;
//결과가 같다가 나오도록 수정하기~
//학번만 같으면 같은 사람으로 인정
public class PersonEx {

	public static void main(String[] args) {
		Person p1 = new Person(1111, "광해");
		Person p2 = new Person(1111, "광해군");
		
		if(p1.equals(p2)) System.out.println("같다");
		else System.out.println("다르다");

	}

}
