package ch09_01;

import java.util.Calendar;
import java.util.Date;

public class Calen1 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); //Calendar는 싱글톤이기 때문에 new 인스턴스화 불가능
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) +1; //0월부터라 +1 해줘야함
		int date = cal.get(Calendar.DATE);
		
		System.out.printf("오늘은 %d년 %d월 %d일입니다\n", year, month, date);
		
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		System.out.printf("지금은 %d: %d: %d시입니다\n", hour, min, sec);
		
		Date dt = cal.getTime();
		System.out.println("cal.getTime->"+dt);
								//현재 월의 날짜
		int dy1 = cal.get(Calendar.DAY_OF_MONTH);
								//현재 년도의 날짜
		int dy2 = cal.get(Calendar.DAY_OF_YEAR);
		System.out.println(dy1 + ", " +dy2);
	}

}
