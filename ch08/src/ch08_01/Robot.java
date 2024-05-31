package ch08_01;

public interface Robot {

}

class DansRobot implements Robot {
	void dance() {
		System.out.println("춤을 춥니다");
	}
}
class DrawRobot implements Robot {
	void draw() {
		System.out.println("그림을 그립니다");
	}
}
class SingRobot implements Robot {
	void sing() {
		System.out.println("노래를 부릅니다");
	}
}