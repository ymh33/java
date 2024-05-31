package ch08_04;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean roll() {
		++accumulateRotation;
		if(accumulateRotation<maxRotation) {
			System.out.println(location + "Hankook Tire 수명: " + (maxRotation-accumulateRotation) + "회");
			return true;
		}else {
			System.out.println("***" + location+ "Hankook Tire 펑크***");
			return false;
	}
	}

}
