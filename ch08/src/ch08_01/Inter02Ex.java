package ch08_01;

interface E1 {
	void aa();
}			//추상 클래스를 확장시키는 역할이다
interface E2 extends E1 {
	void bb();
}
interface E3 extends E2 {
	void cc();
}
class E4 implements E3 {

	@Override
	public void bb() {
		System.out.println("E4 난 E2에 있는 Method bb()");
	}

	@Override
	public void aa() {
		System.out.println("E4 난 E1에 있는 Method aa()");
		
	}

	@Override
	public void cc() {
		System.out.println("E4 난 E3에 있는 Method cc()");
		
	}
	
}

public class Inter02Ex {

	public static void main(String[] args) {
		//선언은 부모타입 가능
		E2 e2 = new E4(); 
		e2.aa();
		e2.bb();
		//e2.cc(); 메모리는 E4를 할당했지만 선언한 객체(E2) 메소드만 이용가능
		
		E4 e4 = new E4();
		e4.aa();
		e4.bb();
		e4.cc();
		

	}

}
