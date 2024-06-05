package ch10_01;

public class Exception04 {
	
	static void method1() throws Exception {
		System.out.println("method1 run");
		method2();
		
	}
	static void method2() throws Exception {
		System.out.println("method1 run");
		throw new Exception();
		
	}
	public static void main(String[] args) throws Exception {
		method1();
		System.out.println("main End");
		
	}


}
