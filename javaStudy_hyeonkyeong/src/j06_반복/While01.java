package j06_반복;

public class While01 {

	public static void main(String[] args) {
		
		int i = 0;
		int result = 0;
		
		while(i < 100) {
			//i += 3; //복합 대입 연산자
			//i++; // 제일 많이 씀!(0부터 시작)
			//++i; // 1부터 시작!
			
			
			result = result + (i + 1);
			i++; //조건 변화 수식
		}
		System.out.println(result);
		
		
		
		

	}

}
