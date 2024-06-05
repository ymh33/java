package ch10_05;
//최대급여 에러메세지
public class MyExceptionEx02_02 extends Exception{
	public String getMessage() {
		String ErrMsg;
		ErrMsg = "사장님 1000만원 넘 많아요 , 좀 적당히 합시다";
		return ErrMsg;
	}

}
