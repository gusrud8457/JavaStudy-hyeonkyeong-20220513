package j11_배열;

public class Array02 {

	public static void main(String[] args) {
//		int size = 4;  
//		int [] number = new int[size];//인덱스가 아니고 갯수
//		
//		System.out.println(numbers.length);
		
		/*
		 * for문으로 0~99까지 반복을 함.
		 * 변수 i의 값이 8의 배수이면
		 * 8의 배수 개수만큼 배열을 생성하고 
		 * 8의 배수를 모두 배열에 대입함.
		 * 배열에 들어있는 8의 배수들을 모두 출력하시오.
		 *   
		 */
		
		System.out.println(0 % 8);
		int size = 0;
		
		for(int i = 0; i < 100; i++) {
			if(i != 0 && i % 8 == 0) {
				size++;
			}
		}
		int[] numbers; //배열 변수 선언
		numbers = new int[size]; //size 변수의 크기에 해당하는 배열 생성
		
		for(int i = 0, j = 0; i < 100; i++) {
			 if(i != 0 && i % 8 == 0) {
				 numbers[j] = i;
				 System.out.println(numbers[j]);
				 j++;
			 }
		 }
		
//		for(int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
//		

	}
	

}
