package j05_조건;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		
		System.out.println("좌표를 입력하세요 : ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if((x > -1000 || x > 1000) && (y > -1000 || y > 1000)) {
			System.out.println("계산 불가");
		}else if (x == 0 && y == 0) {
			System.out.println("원점");
		}else if (x < 1000 && y < 1000) {
			System.out.println("제 1사분면");
		}else if (x < -1001 && y < 1001) {
			System.out.println("제 2사분면");
		}else if (x < -1001 && y < -1001) {
			System.out.println("제 3사분면");
		}else if (x < 1001 && y < -1001) {
			System.out.println("제 4사분면");
		}else { 
			System.out.println("땡");
		}
			
			
		

	}

}
