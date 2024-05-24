package ch02_ex01;

public class CastingEx {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char)intValue;
		System.out.println("charValue->"+charValue);
		
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println("longValue1->"+longValue);
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println("intValue2->"+doubleValue);


	}

}
