package ch06_ex01;
//숙제
class Person {
	String name;
	int age;
	String gender;
	void print() {
		System.out.println("이름:" +name+ " 나이:" +age+ " 성별: " +gender);
	}

	public static void main(String[] args) {
		//Instance per11, per12, per13
		Person per11 = new Person();
		Person per12 = new Person();
		Person per13 = new Person();
		per11.name = ("홍길동");
		per12.name = ("연개소문");
		per13.name = ("선덕여왕");
		
		per11.age = (52);
		per12.age = (62);
		per13.age = (72);
		
		per11.gender = ("M");
		per12.gender = ("M");
		per13.gender = ("F");
		
		per11.print();
		per12.print();
		per13.print();

	}

}
