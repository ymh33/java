package ch12_03;

import java.util.ArrayList;

class Before extends Thread {
	Before(String str) {
		super(str);
	}
	void addCar() {
		System.out.println("addCar");
		Jointest.carList.add("벤츠");
		Jointest.carList.add("아우디");
		Jointest.carList.add("SM7");
		Jointest.carList.add("포르쉐");
	}
	public void run () {
		System.out.println(getName());
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			
		}
		addCar();
	}
}

class After extends Thread {
	After(String str) {
		super(str);
	}
	public void run() {
		System.out.println(getName());
		for(String car : Jointest.carList) {
			System.out.println(car);
		}
	}
} 

public class Jointest {
	public static ArrayList<String> carList = new ArrayList<String>();

	public static void main(String[] args) {
		Before bf = new Before("우선");
		After af = new After("나중에");
		bf.start();
		try {//현재 실행된 스레드가 죽을때까지 기다림
			bf.join();
		}catch (InterruptedException e) {
			
		}
		af.start();
				

	}

}
