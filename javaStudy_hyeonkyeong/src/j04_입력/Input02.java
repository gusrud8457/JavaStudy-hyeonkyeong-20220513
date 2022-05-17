package j04_입력;

import java.util.Scanner;

public class Input02 {

	public static void main(String[] args) {
		/*
		 * 
		 * 문자열1 입력 : nextLine()		hi
		 * 문자열2 입력 : next()			안녕
		 * 문자 입력 : next().charAt(0)		A
		 * 정수 입력 : nextInt()			10	
		 * 실수 입력 : nextDouble()			3.14
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		//나
		
		/*System.out.print("문자열1 입력 : ");
		String aw = sc.nextLine();
		System.out.println(aw);
		
		System.out.print("문자열2 입력 : ");
		String aw1 = sc.next();
		System.out.println(aw1);
		
		System.out.print("문자 입력 : ");
		char aw2 = sc.next().charAt(0);
		System.out.println(aw2);
		
		System.out.print("정수 입력 : ");
		int aw3 = sc.nextInt();
		System.out.println(aw3);
		
		System.out.print("실수 입력 : ");
		double aw4 = sc.nextDouble();
		System.out.println(aw4);*/
		
		//강사님
		//변수명을 정의해주기!
		String a = null;
		String b = null;
		char c  = 0;
		int d = 0;
		double e = 0;
		
		System.out.println("문자열1 입력 : ");
		a = sc.nextLine();
		System.out.println("문자열2 입력 : ");
		b = sc.next();
		System.out.println("문자 입력 : ");
		c = sc.next().charAt(0);
		System.out.println("정수 입력 : ");
		d = sc.nextInt();
		System.out.println("실수 입력 : ");
		e = sc.nextDouble();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

	}

}
