package ch_02;

import javax.swing.JOptionPane;

public class ThreadEx05 {

	public static void main(String[] args) throws InterruptedException {
		String name = JOptionPane.showInputDialog("너 이름이 뭐니?");
		for (int i =0; i<10; i++) {
			System.out.println((i));
			Thread.sleep(1000);
		}
		System.out.println("당신의 이름은" +name+ "입니다");


	}

}
