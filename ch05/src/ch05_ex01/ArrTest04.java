package ch05_ex01;

public class ArrTest04 {

	public static void main(String[] args) {
		int array[]= {76,45,34,89,100,50,90,92};
		int Temp=0;
		
		for(int i=0; i<array.length; i++) {
			for(int j= i +1; j<array.length; j++) {
				if(array[i]>array[j]) {
					Temp=array[i]; //데이터를 교환하는 알고리즘
					array[i]=array[j];
					array[j]=Temp;
				}
			}
		}
		for(int i=0; i<array.length; i++) {
			System.out.println(" " +array[i]);
		}

	}

}


