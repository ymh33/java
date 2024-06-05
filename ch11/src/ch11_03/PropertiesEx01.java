package ch11_03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

//****
public class PropertiesEx01 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pt = new Properties();
		String path = PropertiesEx01.class.getResource("database.properties").getPath();
		System.out.println("1 path : " + path);
		path = URLDecoder.decode(path, "utf-8");// <-path를 utf-8로 인코딩하는 줄
		System.out.println("2 path : " + path);
		pt.load(new FileReader(path));
		String driver = pt.getProperty("driver");
		String url = pt.getProperty("url");
		String userName = pt.getProperty("username");
		String password = pt.getProperty("password");

		System.out.println("드라이버: " + driver);
		System.out.println("url: " + url);
		System.out.println("userName: " + userName);
		System.out.println("password: " + password);

	}

}
