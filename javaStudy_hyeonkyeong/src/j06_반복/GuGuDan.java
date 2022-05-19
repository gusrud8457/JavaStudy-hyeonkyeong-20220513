package j06_반복;

public class GuGuDan {

	public static void main(String[] args) {
		/*
		 * 2단 부터 9단까지 반복문
		 */
		for(int i = 0; i < 8; i++) {
			System.out.println((i + 2)+"단");
			
			for(int j = 0; j < 9; j++) {
				
				int result = (i + 2) * (j + 1);
				
				System.out.println((i + 2) + " x " + (j + 1) +" = " + result);
						
			} System.out.println();
		} 

	}

}
