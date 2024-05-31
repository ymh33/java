package ch05_ex01;

public class ArrTest02 {
//출력 : 500원 5개, 100원 1개, 50원 1개, 10원 3개
	public static void main(String[] args) {
		int money = 8720;
		int [] unint = {500, 100, 50, 10};
		
		for(int i = 0; i < unint.length; i++) {
			int cnt = money / unint[i];
			System.out.println(unint[i]+"원 짜리 :" + cnt + "개");
			money%=unint[i];
			System.out.println("교환하고 남은 money->" + money);
		}
		

	}

}
