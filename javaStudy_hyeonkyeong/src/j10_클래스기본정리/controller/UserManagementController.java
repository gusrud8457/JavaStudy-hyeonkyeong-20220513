package j10_클래스기본정리.controller;

import j10_클래스기본정리.repository.User;
import j10_클래스기본정리.service.UserService;

public class UserManagementController {
	private UserService userService;
	private User[] users;
	
	public UserManagementController(UserService userService) {
		this.userService =  userService;
		users = new User[2];
	}
	
	public void createUser() {
		int indexResult = findEmptyInUsers();
		if(indexResult != -1) {
			users[indexResult] = userService.insertUser();
			
			System.out.println("[새로 추가된 사용자]");
			System.out.println(users[indexResult].toString());
			
		}else {
			System.out.println("더이상 사용자를 추가할 수 없습니다.");
		}
	
		users[0] = userService.insertUser();
		
		
	}
	private int findEmptyInUsers() {
		for(int i = 0; i < users.length; i++) {
			if(users[i] == null) {
				return i;
			}
		}
		return -1; //빈공간 못 찾음.
	}

	public void updateUser() {
		
	}
}
