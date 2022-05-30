package j14_추상화;

/*
 * abstract(추상) 
 * 
 * 추상 메소드
 * 1. return type 앞에 abstract 키워드가 붙는다.
 * 2. 추상 메소드는 일반 클래스 안에 선언할 수 없다.
 * 3. 상속 또는 구현된 클래스에서 무조건 override(재정의)가 되어야 한다.
 * 
 * 추상 클래스 
 * 1. 클래스 type 앞에 abstract 키워드가 붙는다.
 * 2. 추상 클래스는 객체 생성할 수 없다.
 * 3. 추상 메소드를 포함할 수 있다. (but 추상 메소드 꼭 포함 안해도 됨.)
 *
 * 
 * 
 */


//추상 클래스
public abstract class Factory {
	
	//추상 메소드 : 무조건 있어야 함.
	public abstract void start();
	
	//일반 메소드 : 있어도 되고 없어도 되고
	public void stop() {
		System.out.println("공장을 멈춥니다.");
	 }
	
	private void test() {
		
		
	}

}
