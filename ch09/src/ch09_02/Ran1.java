package ch09_02;

import java.util.Random;

public class Ran1 {

	public static void main(String[] args) {
		Random ran = new Random();
		System.out.println("100이하 정수:" +ran.nextInt(101));
		System.out.println("랜덤 정수:" +ran.nextInt());
		System.out.println("double:" +ran.nextDouble());
		System.out.println("float:" +ran.nextFloat());
		System.out.println("long:" +ran.nextLong());

	}

}
