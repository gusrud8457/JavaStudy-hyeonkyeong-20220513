package j08_클래스;

public class UserMain {

	public static void main(String[] args) {
		User u1 = new User();
		System.out.println("첫번째 : " + u1.name);
		System.out.println("메인 메소드에서 호출 : " + u1);
		//u1.name = "김준일";
		u1.setName("aaaa");
		System.out.println("두번째 : " + u1.name);
		System.out.println("-------------------------------");
		
		User user2 = new User("김준일", "29", "01099881916", "부산");
		System.out.println(user2.name);
		System.out.println(user2.age);
		System.out.println(user2.phone);
		System.out.println(user2.address);
		
		
		
		
		
	}

}
