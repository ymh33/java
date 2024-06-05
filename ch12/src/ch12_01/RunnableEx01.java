package ch12_01;

import java.io.IOException;
import java.nio.CharBuffer;

class Ra1 implements Runnable {
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(i + "대박" + Thread.currentThread().getName());
			try {
				Thread.sleep(10);

			} catch (InterruptedException e) {
			}
			}
		}
	}
	class Ra2 implements Runnable {
		public void run() {
			for (int i = 1; i <= 20; i++) {
				System.out.println(i + "월요일" + Thread.currentThread().getName());
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					
				}
		}
	}
	}
		public class RunnableEx01 {

			public static void main(String[] args) {
				Ra1 r1 = new Ra1();
				Ra2 r2 = new Ra2();
				//implement한 것은 반드시 아래와 같은 선언 후 사용
				//Thread 다중 상속을 위해 인터페이스 클래스(Runnable)를 제공한다
				Thread th1 = new Thread(r1, "Pr");
				Thread th2 = new Thread(r2, "no");
				
				th1.start();
				th2.start();
			}
				
			}