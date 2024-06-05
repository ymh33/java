package ch_02;
//각각 스레드가 20번씩 수행
//Th3 -> 10/1000쉼
//Th4 -> 20/1000쉼
class Th3 extends Thread {
	Th3(String str) {
		super(str);
	}
	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(getName()+"대박"+i);
			try {
				sleep(10);
			} catch (InterruptedException e) {
			}
		}
	}
	
		
	}

class Th4 extends Thread {
	Th4(String str) {
		super(str);
	}
	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(getName()+"월요일"+i);
			try {
				sleep(20);
			} catch (InterruptedException e) {
			}
		}
	}
	
		
	}

public class ThreadEx04_Hw {

	public static void main(String[] args) {
		Th3 th1 = new Th3("Th3...");
		Th4 th2 = new Th4("Th4...");
		th1.start();
		th2.start();

	}

}
