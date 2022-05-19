package j06_반복;

public class Star {

	public static void main(String[] args) {
		/*
		 *     *
		 *    **
		 *   ***
		 *  ****  
		 * *****
		 * 
		 * *****
		 *  ****
		 *   *** 
		 *    ** 
		 *     *
		 *  
		 *  
		 *      *
		 *     ***
		 *    *****(5층)
		 *   ********
		 * ************   
		 */
		for(int i = 0; i < 5; i++) {
			for(int d = 0; d < i + 1; d++) {
				System.out.print("*");
			} 
			System.out.println();
		}
			
		for(int i = 0; i < 5; i++) {
			for(int d = 0; d < 5 - i; d++) {
				System.out.print("*");
			} 
			System.out.println();
		}

	}

}
