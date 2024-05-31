package ch08_robot;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("SuperRobot주문. 만들어주세요");
		Robot superRobot = new SuperRobot();
		superRobot.shape();
		superRobot.actionBasic();
		superRobot.actionFly();
		superRobot.actionFire();
		superRobot.actionKnife();
		
		System.out.println("------------------------------");
		System.out.println("StandardRobot주문. 만들어주세요");
		Robot standRobot = new StandardRobot();
		standRobot.shape();
		standRobot.actionBasic();
		standRobot.actionFly();
		standRobot.actionFire();
		standRobot.actionKnife();
		
		System.out.println("------------------------------");
		System.out.println("CheapRobot주문. 만들어주세요");
		Robot cheRobot = new CheapRotbot();
		cheRobot.shape();
		cheRobot.actionBasic();
		cheRobot.actionFly();
		cheRobot.actionFire();
		cheRobot.actionKnife();


	}

}
