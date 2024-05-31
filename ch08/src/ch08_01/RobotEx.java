package ch08_01;

public class RobotEx {
	
	
	//static을 해줘야한다 (스태틱메소드는 스태틱메소드만 호출가능)
	static void action(Robot r) {
			//instanceof :r의 객체가 DansRobot이냐?
		//객체를 비교할 때 사용한다
		//=r이 DansRobot의 객체일때 작동하는 조건문
		if (r instanceof DansRobot) {
			//DansRobot r = (DansRobot) r; <=같은 타입이라 형변환 가능
			//r.Dans(); 
			((DansRobot)r).dance();
		} else if (r instanceof DrawRobot) {
			((DrawRobot)r).draw();
		} else {
			//((SingRobot)r).sing();
			SingRobot sr = (SingRobot) r;
			sr.sing();
		}
	}

	public static void main(String[] args) {
		Robot[] rb = new Robot[3];
		rb[0] = new DansRobot();
		rb[1] = new DrawRobot();
		rb[2] = new SingRobot();
		//Robot[] rb = DansRobot, DrawRobot, SingRobot
		
		for (Robot r : rb) {
			action(r);
		}

	}

}
