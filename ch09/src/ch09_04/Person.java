package ch09_04;
//숙제
public class Person {
	int id;
	String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
//	public boolean equals(Person pr) {
//		boolean result = false;
//		if (id == pr.id) result = true;
//		return result; <- 내 풀이
	
	public boolean equals (Object obj) {
		boolean b = false;
		Person p = null;
		if (obj instanceof Person) p = (Person)obj;
		if (obj != null && this.id==p.id) b = true;
		return b;
		
	}


}
