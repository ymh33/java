package ch08_05;

public class Student2 extends Person2 {
	private String sno; 

	Student2(String name, int age, String sno) {
		super(name, age);
		this.sno = sno;
	}
	public void print() {
		super.print();
		System.out.println("학번:" + sno);
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}

}
