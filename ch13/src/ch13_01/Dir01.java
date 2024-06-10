package ch13_01;

import java.io.File;

public class Dir01 {

	public static void main(String[] args) {
		//File file = new File(".");
		//File file = new File("src/ch13_01");
		File file = new File("../ch12/src/ch12_01");
		
		String[] list = file.list();
		System.out.println("list->" +list);
		for (String str:list) {
			System.out.println(str);
		}

	}

}
