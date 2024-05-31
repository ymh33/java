package ch05_ex02;

import java.util.Calendar;

public class EunmWeekEx {

	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		//현재 일자의 번호를 가져온다(java 내장 함수)
		int weekNum = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(weekNum) {
			case 1:
				today = Week.SUNDAY; break;
			case 2:
				today = Week.MONDEY; break;
			case 3:
				today = Week.TUESDAY; break;
			case 4:
				today = Week.WEDNESDAY; break;
			case 5:
				today = Week.THURSDAY; break;
			case 6:
				today = Week.FRIDAY; break;
			case 7:
				today = Week.SATURDAY; break;
		}
		System.out.println("오늘 요일:" + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else { 
			System.out.println("자바공부를 합니다.");
		}
	}
	

}
