package ch08_07;

public class Aoudio implements RemoteControl {
	//필드
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Aoudio를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("Aoudio를 끕니다.");

	}

	@Override
	public void SetVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨:" + volume);

	}

}
