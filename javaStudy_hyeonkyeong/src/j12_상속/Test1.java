package j12_상속;

public class Test1 extends Test{
	
	public Test1() {
		super(); //부모 클래스(주소)를 생성
		System.out.println("T1 생성자 호출");
		System.out.println("T1에서 확인 : " + super.toString());
		
	}
	
	

}
