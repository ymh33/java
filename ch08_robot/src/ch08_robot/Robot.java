package ch08_robot;

import ch08_robot.actions.FireAction;
import ch08_robot.actions.FlyAction;
import ch08_robot.actions.KnifeAction;

public abstract class Robot {
	public FlyAction flyAction;
	public FireAction fireAction;
	public KnifeAction knifeAction; //knifeNo, knifeWithWood, knifeWithLazer 
	
	public Robot() {
	
	}
	//추상 메소드
	public abstract void shape();
	
	//일반메소드
	public void actionBasic() {
		System.out.println("팔, 다리, 머리, 몸통이 있죠");
		
	}
	public void actionFly() {
		flyAction.fly();
	}
	public void actionFire() {
		fireAction.fire();
		
	}
	public void actionKnife() {
		knifeAction.knife();
		
	}
	public void setFlyAction(FlyAction flyAction) {
		this.flyAction = flyAction;
	}
	public void setFireAction(FireAction fireAction) {
		this.fireAction = fireAction;
	}
	
	
}
