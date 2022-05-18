package j05_조건;

public class SwitchCase {

	public static void main(String[] args) {
		int num = 2;
		char c = 'a';
		String str = "한재안";
			
		
		switch (num) {
			case 1 : 
				System.out.println("case 1");
				break;
			case 2 : 
				System.out.println("case 2");
				break;
			case 3 : 
				System.out.println("case 3");
				break;
			}
		switch (c) {
			case 'a' : 
				System.out.println("case a");
				break;
			case 'b' : 
				System.out.println("case b");
				break;
			case 'c' : 
				System.out.println("case c");
				break;
			}
		switch (str) {
			case "김준일" : 
				System.out.println("case 김준일");
				break;
			case "박준형" : 
				System.out.println("case 박준형");
				break;
			case "한재안" : 
				System.out.println("case 한재안");
				break;
			}

	}

}
