package ch07_ex01;

class Encpaulse {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if (age < 0) System.out.println("나이 입력 오류");
		else this.age = age;
	}
}

public class EncapsuleEx {

	public static void main(String[] args) {
		Encpaulse h1 = new Encpaulse();
		//h1.name = "김준수";
		//h1.age = -10; private 변수이기 때문에 에러가 남
		
		h1.setName("김준수");
		h1.setAge(-10);
		
		System.out.println("이름: " + h1.getName());
		System.out.println("나이: " + h1.getAge());

	}

}
