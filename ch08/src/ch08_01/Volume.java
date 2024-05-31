package ch08_01;

public interface Volume {
	void volumeUp();
	void volumeDown();

}

class TV implements Volume {
	@Override
	public void volumeUp() {
		System.out.println("TV Volume 올리기");
		
	}
	@Override
	public void volumeDown() {
		System.out.println("TV Volum 내리기");
		
	}
	void play() {
		System.out.println("TV 화면을 본다");
	}
	
}

class Audio implements Volume {
	@Override
	public void volumeUp() {
		System.out.println("Audio Volume 올리기");
		
	}
	@Override
	public void volumeDown() {
		System.out.println("Audio Volum 내리기");
	}
		
	}

	

class Speaker implements Volume {
	@Override
	public void volumeUp() {
		System.out.println("Speaker Volume 올리기");
		
	}
	@Override
	public void volumeDown() {
		System.out.println("Speaker Volum 내리기");
	}
}
		


	