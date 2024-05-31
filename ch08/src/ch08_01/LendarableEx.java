package ch08_01;

public class LendarableEx {

	public static void main(String[] args) {
		
		SeperateVolume sv = new SeperateVolume("젋은 베르테르 슬픔");
		sv.checkOut("정승환/박윤하", "2024/03/21");
		sv.checkin();

	}

}
