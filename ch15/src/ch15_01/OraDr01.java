package ch15_01;

import java.sql.Connection;
import java.sql.DriverManager;

public class OraDr01 {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		try {
			//오라클 드라이버를 메모리에 업로드
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("Start");
			if (conn != null) {
				System.out.println("연결 성공");
				
			}else { 
				System.out.println("연결실패");
			}
			conn.close();
		} catch (Exception e) {
			System.out.println("Error");
		}

	}

}
