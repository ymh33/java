package ch10_04;

public class MyException extends Exception {
	@Override
	public String getMessage() {
		//return super.getMessage();
		String errMessage;
		//Buz Error
		errMessage = "10보다 크면 안됨!!!";
		return errMessage;
	}

}
