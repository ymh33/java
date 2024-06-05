package ch_02;

class th1 extends Thread {
	public void run() {
		for (int i =0; i <= 20; i++) {
			System.out.println("대박" +i+ "\t");
			if(i%5==0) System.out.println();
			try { 
				sleep(50);
				
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			
		}
	}
}
class th2 extends Thread {
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println("수요일" +i+ "\t");
			try {
				sleep(50);
				
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}


public class ThreadEx03 {
	public static void main(String[] args) {
		th1 t1 = new th1();
		th2 t2 = new th2();
		t1.start();
		t2.start();
		
	}

}
