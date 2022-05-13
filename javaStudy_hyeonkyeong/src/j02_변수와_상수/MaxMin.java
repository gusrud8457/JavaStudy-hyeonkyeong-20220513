package j02_변수와_상수;

public class MaxMin {

	public static void main(String[] args) {
		//상수 : 변하지 않는 값(유일하게 사용)/ 상수명은 무조건 다 대문자!!
		//상수는 이름 구분 하기 위해선 _ 언더바 써야함.
		//변수는 첫 글자 소문자, 카멜법 사용임.
		
		final int MAX_NUMBER = 100;
		final int MIN_NUMBER;
		MIN_NUMBER = 10;
		
		final String PATH = "C:\\junil\\junil\\workspace";
		
		final double PI = 3.14;
		
		System.out.println("최대값 : " +  MAX_NUMBER);
		System.out.println("최소값 : " +  MIN_NUMBER);
		
		// 업캐스팅 : 문자->정수->실수
		// 값이 작은 범위에서 큰 범위로의 형변환
		// 다운 캐스팅 : 실수-> 정수-> 문자
		// 값이 큰 범위에서 작은 범위로의 형변환
	}
}
