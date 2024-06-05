package ch12_01;
//숙제
class Th1 extends Thread {
	Th1(String str) {
		super(str);
	}
	public void run() {
		for (int i =0; i <= 20; i++) {
			System.out.println("대박" +i+ "\t");
			if(i%5==0) System.out.println();
			try { 
				sleep(50);
				
			} catch (InterruptedException e) {
			}
			
		}
	}
}
class Th2 extends Thread {
	Th2(String str) {
		super(str);
	}
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println("수요일" +i+ "\t");
			try {
				sleep(50);
				
			} catch (InterruptedException e) {
			}
		}
	}
}
public class RunnableEx02 {

	public static void main(String[] args) {
		//1.Ra3 : I/F상속, 20번 수행 --> getName()+대박+i
		//2.Ra4 : I/F상속, 20번 수행 --> getName()+월요일+i
		//3.Th1 상속 받아서 시행시켜주기~ 
		//4.Th2 상속 받아서 시행시켜주기~
		Ra3 r1 = new Ra3();
		Ra4 r2 = new Ra4();
		Th1 th3 = new Th1("zz");
		Th2 th4 = new Th2("oo");

	}

}
