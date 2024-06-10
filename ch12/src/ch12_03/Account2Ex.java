package ch12_03;

//스레드 생성
class Account2User extends Thread {
	 Account2 act;
	 boolean flag;
	 public Account2User (Account2 act, String name) {
		 super(name);
		 this.act =act;
	 }
	 public void run () {
		 for(int i = 0; i < 5; i++) {
			 try {
				 Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//동시접근을 막아준다(상호배타적)
			 synchronized (act) {
				 if (flag) act.deposit((int)(Math.random()*10000), getName());
				 else	act.withdraw((int)(Math.random()*10000), getName());
				 flag = !flag;
				
			}
		 }
	 }
	
}

public class Account2Ex {

	public static void main(String[] args) {
		Account2 act1 = new Account2(10000);
		Account2 act2 = new Account2(15000);
		Account2User au1 = new Account2User(act1, "하니");
		Account2User au2 = new Account2User(act1, "민지");
		Account2User au3 = new Account2User(act1, "혜린");
		Account2User au4 = new Account2User(act2, "정국");
		Account2User au5 = new Account2User(act2, "뷔");
		Account2User au6 = new Account2User(act2, "지민");
		au1.start();
		au2.start();
		au3.start();
		au4.start();
		au5.start();
		au6.start();

	}

}
