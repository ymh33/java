package ch08_robot;

import ch08_robot.actions.FireOk;
import ch08_robot.actions.FlyAction;
import ch08_robot.actions.FlyOk;
import ch08_robot.actions.knifeWithLazer;

public class SuperRobot extends Robot {
	public SuperRobot() {
		flyAction = new FlyOk();
		fireAction = new FireOk();
		knifeAction = new knifeWithLazer();

	}

	@Override
	public void shape() {
		System.out.println("기본적으로 팔, 다리, 머리, 몸통 존재. 비행 가능");

	}

}
