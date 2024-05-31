package ch08_01;

class A1 {
	private int kkk;
	public void print() {
		System.out.println("   부모 메소드 print");
	}
}

class A2 extends A1 {
//	@Override
//	public void print() {
//		// TODO Auto-generated method stub
//		super.print();
//	}
	public void print3() {
		System.out.println("A2의  메소드 print");
	}
}
public class OverRide01 {

	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.print();
		//a1.print3 부모class는 자식class를 사용 불가능
		A1 a2 = new A2(); //선언은 부모class 가능
		//상속시 super(부모class) 사용 가능
		a2.print();
		//선언을 super는 사용불가능
		//a2.print3();
		A2 a22 = new A2();
		a22.print();
		a22.print3();

	}

}
