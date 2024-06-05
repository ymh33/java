package ch10_05;
//최소급여 에러메세지
public class MyExceptionEx02_01 extends Exception  {
	public String getMessage() {
	//Buz Rule
	//최소급여 100 ~ 최대급여 1000
	String ErrMsg;
	ErrMsg = "사장님 100만원 보다 적어요";
	return ErrMsg;
	}
	

}
