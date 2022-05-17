package j04_입력;

import java.util.Scanner;

public class Input01 {
	//윤년 값 만들어 오기

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("첫번째 값 입력 : ");
		 int num1 = scanner.nextInt();
		 System.out.print("두번째 값 입력 : ");
		 int num2 = scanner.nextInt();
		 
		 System.out.println("결과는 : " + (num1+num2));
		 
		 scanner.next();				//문자열(String)
		 scanner.nextLine();			//문자열(String)
		 scanner.next().charAt(0);  	//문자(char)
		 scanner.nextInt();				//정수(int)
		 scanner.nextDouble();			//실수(double)
				
		 //System.out.println("입력한 값 : " + num);
		 
		//숙제
		 /*Scanner scanner2 = new Scanner(System.in);
		 System.out.print("년도 입력 : ");
		 int num2 = scanner2.nextInt();
		 boolean result = (num2 % 4 == 0)&&(num2 % 100 !=0)||(num2 % 400 == 0);
		 System.out.println("결과는 : " + result);
		 */
		 
		 


	}

}
