package j02_변수와_상수;

public class MyInfo {

	public static void main(String[] args) {
		//주석 
		/* 
		 * 메모, 필기 
		 * 
		 * 1.문제
		 * name1, name2, name3
		 * age(나이)
		 * phone(연락처)
		 * address(주소)
		 * */
		 
		char name1 = '정'; //한글자는 char
		char name2 = '현';
		char name3 = '경';
		int age = 27;
		String phone= "010-3144-8457"; //문자열 
		String address = "부산시 해운대구 재송동";
		
		System.out.println("이름 : "+ name1+ name2 + name3); //16진수 AC01-> 10진수
		System.out.println("나이 : "+ age);
		System.out.println("연락처 : "+ phone);
		System.out.println("주소 : "+ address);
		System.out.println("--------------------");
		
		System.out.println("세 수의 합 : "+ (10+20+30));//()하여 연산 우선순위를 만들어 주라.
		System.out.println("--------------------");
		
		
	}

}
