package j09_접근지정자.a;

public class Student {
	private String name;
	private String shoolName;
	
	//setter
	public void setName(String name) {//자료형이 같아야 함.
		this.name = name;
	}
	
	//getter
	public String getName() { //매개변수 필요없음.
		return name;
	}

}
