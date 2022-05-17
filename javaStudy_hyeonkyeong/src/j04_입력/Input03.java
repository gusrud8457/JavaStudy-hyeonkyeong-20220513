package j04_입력;

import java.util.Scanner;

public class Input03 {

	public static void main(String[] args) {
		/*
		 * [개인정보 입력]
		 * 이름 : 김준일		문자열  name
		 * 나이 : 29			정수    age
		 * 연락처 : 010			문자열	phone
		 * 주소 :				문자열	address
		 * 성별 : 				문자    gender
		 * 
		 * [개인정보 출력]
		 * 이름 => 김준일		문자열
		 * 나이 => 29			정수	
		 * 연락처 => 010		문자열	
		 * 주소 =>				문자열	
		 * 성별 =>				문자
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		String name = null;
		int age = 0;
		String phone = null;
		String address = null;
		char gender = 0;
		
		System.out.println("[개인정보 입력]");
		System.out.print("이름 : ");
		name = sc.next(); // 스페이스바나 엔터를 쓰면 거기까지 입력(엔터나 스페이스바 무시)
		System.out.print("나이 : ");
		age = sc.nextInt();
		System.out.print("연락처 : ");
		phone = sc.next(); 
		sc.nextLine(); //next() 다음에 sc.nextLine();을 꼭 추가해서 스페이스나 엔터 날라가게 해야 함.
		System.out.print("주소 : ");
		address = sc.nextLine(); // 띄어쓰기 가능(엔터나 스페이스바 포함)
		System.out.print("성별 : ");
		gender = sc.next().charAt(0);
		System.out.println();
		
		System.out.println("[개인정보 출력]");
		System.out.println("이름 => "+name);
		System.out.println("나이 => "+age);
		System.out.println("연락처 => "+phone);
		System.out.println("주소 => "+address);
		System.out.println("성별 => "+gender);
		
		
		
	
		

	}

}
