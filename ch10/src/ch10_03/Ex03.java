package ch10_03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {
		FileReader reader;
		char[] buffer = new char[100];
		String file_name = ".classpathKKK";
		
		try {
			reader = new FileReader(file_name);
			reader.read(buffer,0,90);
			String str = new String(buffer);
			System.out.println("읽은건" + str);
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("그런 파일 없당");
		} catch (IOException e) {
			System.out.println("읽다가 에러남");
		} finally {
			System.out.println("어쨋거나 읽어냄");
		}

	}

}
