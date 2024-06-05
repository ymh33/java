package ch09_03;

import java.util.StringTokenizer;

public class StringTok1 {

	public static void main(String[] args) {									//".,"구분자(딜리메타)
		StringTokenizer st = new StringTokenizer("산딸기, 집딸기,판딸기.집딸기,알카리딸기",".,");
		//StringTokenizer는 토큰으로 취급한다는 의미
		//.이나 ,를 기준으로 하나의 원소로 취급한다
		while (st.hasMoreElements()) { //향상형 for문의 역할
			System.out.println(st.nextElement());
		}

	}

}
