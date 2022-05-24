package j06_반복;

public class Continue {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			
			if(i % 2 == 0) {
				continue; //continue 다음엔 실행 안됨!!
			}
			System.out.println(i);	
		}

	}

}
