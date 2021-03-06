package j17_스태틱.student;

public class Student {
	/*
	 * student_code(정수)
	 * student_name(이름)
	 * student_year(학년)
	 * 
	 * 학생을 한명 생성할 때 마다 자동으로 student_code의 값이 1씩 증가하여 부여될수 있게 작성.
	 * 20220001
	 * 20220002
	 */
	private static int auto_increment = 20220000;
	private int code;
	private String name;
	private int year;
	
	
	public Student(String name, int year) {
		this.code = ++auto_increment;
		this.name = name;
		this.year = year;
	} 

	public void showInfo() {
		 System.out.println("학번 : " + code);
		 System.out.println("이름 : " + name );
		 System.out.println("학년 : " + year);
	 }
	

}
