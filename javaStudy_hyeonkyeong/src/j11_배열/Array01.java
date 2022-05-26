package j11_배열;
/* 
 * int에 class 와 배열[]이 존재.
 */

public class Array01 {

	public static void main(String[] args) {
	
		//1. 배열의 공간(크기)을 정해서 생성
		int [] numbers = new int[10];//int 데이터를 담을 수 있는 10개의 공간을 만듬.
		
		//2. 배열에 들어갈 값을 미리 정해서 생성
		int[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		char[] characters = {'a','b','c','d','e'};
		boolean[] booleans = {true, true, true, false, false};
		
		String [] strArray = new String[5];
		
		System.out.println("numbers의 길이 : " + numbers.length);
		System.out.println("strArray의 길이 : " + strArray.length);
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("i : " + i);
			System.out.println("numbers : " + numbers[i]);
			System.out.println("numbers2 : " + numbers2[i]);
			//System.out.println(strArray[i]); //오류 -> 배열값이 다름
		}
		
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]); //0번째가 주소값(null)
		}
		
		
	}

}
