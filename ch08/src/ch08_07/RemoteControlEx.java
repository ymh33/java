package ch08_07;

public class RemoteControlEx {

	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Telewvision();
		rc.turnOn();
		rc.turnOff();
		rc.SetVolume(5);
		rc.SetVolume(15);
		
		rc.setMute(false);
		rc.setMute(true);
		
		RemoteControl.changeBattery();

	}

}
