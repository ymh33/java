package ch13_01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class FileWirter01 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 파일명");
		String fileName = sc.nextLine();
		System.out.println("저장할 글을 입력하세요");
		String msg = sc.nextLine();
		FileWriter fw = new FileWriter(fileName);
		Date date = new Date();
		fw.write(date+" : " + msg);
		fw.close(); //반드시 해야 파일이 저장된다.
		System.out.println("출력끝");
		sc.close();

	}

}
