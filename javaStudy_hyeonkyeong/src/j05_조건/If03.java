package j05_조건;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		/*
		 * 0보다 작거나 100보다 크면 "계산할 수 없는 점수입니다." 출력하기
		 */
		Scanner sc = new Scanner(System.in);
		
		int score = 0;
		
		System.out.print("점수를 입력하세요 : ");
		score = sc.nextInt();
		
		if (score<0 || score>100) {
			System.out.println("계산할 수 없는 점수입니다."); //내가 틀린 부분!
		}else if(score>89) { //>=쓰지말기
			System.out.println("A");
		}else if(score>79) {
			System.out.println("B");
		}else if(score>69) {
			System.out.println("C");
		}else if(score>59) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		
		 

	}

}
