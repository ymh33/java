package ch08_robot;

import ch08_robot.actions.FireOk;
import ch08_robot.actions.FlyNo;
import ch08_robot.actions.knifeWithWood;

public class StandardRobot extends Robot {
	public StandardRobot() {
		flyAction = new FlyNo();
		fireAction = new FireOk();
		knifeAction = new knifeWithWood();
	}
	@Override
	public void shape() {
		System.out.println("기본적으로 팔, 다리, 머리, 몸통 존재. 달리기 가능");

	}

}
