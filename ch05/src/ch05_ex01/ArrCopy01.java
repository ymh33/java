package ch05_ex01;

public class ArrCopy01 {
//배열을 모듈화 시키자! (reuse(재사용)를 위해서!!)
	public static void main(String[] args) {
		//Index -> 0 1 2 3 4 5 6
		int[] a = {1,2,3,4,5,6,7};
		int[] b = new int [10];
		
		//for(int i =0; i < a.length; i++) {
			//b[i] = a[i];
		//}
		//System.out.println("b->"+b); //객체의 해시값 조회
		System.out.println("---------a, 0, b, 0, a.length----------");
						//a의 i0를 -> Target(b) 0에 복사 : a.length만큼
		System.arraycopy(a, 0, b, 0, a.length); //객체 조회 시 method를 만듦
		pr(b); //b method를 생성
		cls(b); //배열을 클리어(psv 생성) method란? 객체 내에서 사용되는 함수		
						//a의 i0를 -> Target(b) 2에 복사 : a.length만큼	
		System.out.println("---------a, 0, b, 2, a.length----------");
		System.arraycopy(a, 0, b, 2, a.length); 
		pr(b);
		cls(b);
						//a의 i1부터 복사하므로 a.length-1 만큼 시행함 (b0부터 넣음)
		System.out.println("---------a, 1, b, 0, a.length-1----------");
		System.arraycopy(a, 1, b, 2, a.length-1); 
		pr(b);	
		cls(b); 
						//a의 i1부터 복사하므로 a.length-1 만큼 시행함 (b3부터 넣음)
		System.out.println("---------a, 1, b, 3, a.length-1----------");
		System.arraycopy(a, 1, b, 3, a.length-1); 
		pr(b);	
		cls(b); 
	}
	
						//b에 있는 주소(해시)값이 넘어가기 때문에 이름은 상관없다. 변수타입은 맞춰야함!
	private static void cls(int[] barr) {//b주소에 든 값을 전부 0으로 비워주는 함수(method)이다
		for (int i = 0; i < barr.length; i++) {
			barr[i] = 0;
		}
		
	}
	//main에서 호출하는 method는 같은 static이어야 한다.(반드시!!)
	public static void pr(int[] b) {
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + "\t");
		}
		System.out.println();
	}

}