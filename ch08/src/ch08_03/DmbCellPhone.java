package ch08_03;
//숙제
public class DmbCellPhone extends CellPhone {
	//필드
	int channel;
	//생성자
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//메소드
	void turnOnDmb() {
		channel = 10;
		System.out.println("채널" +channel+ "번 DMB 방송 수신을 시작합니다");
	}
	int changeChannelDmb(int channel) {
		System.out.println("채널" +channel+ "번으로 바꿉니다");
		return channel;
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다");
	}
	//결과화면

}
