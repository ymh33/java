package ch08_robot;

import ch08_robot.actions.FireNo;
import ch08_robot.actions.FlyNo;
import ch08_robot.actions.KnifeNo;

public class CheapRotbot extends Robot {
	
	public CheapRotbot() {
		flyAction = new FlyNo();
		fireAction = new FireNo();
		knifeAction = new KnifeNo();
	}

	@Override
	public void shape() {
		System.out.println("기본적으로 팔, 다리, 머리 몸통 존재. 그리고 걸을 수 있당");

	}

}
