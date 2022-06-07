package j20_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

import j20_컬렉션.entity.Student;

public class HashSetEx2 {

	public static void main(String[] args) {
		
		/*
		 * HashSet<Student>
		 * 
		 * 20020001, 김준일, 부산대학교
		 * 20020002, 김준이, 부경대학교
		 * 
		 * 20020002의 코드를 가진 학생을 조회(한명만 나와야 함.)
		 * 
		 * 20220001의 코드를 가진 학생을 삭제
		 * 
		 */
		
		HashSet<Student> hashSet = new HashSet<Student>();
		
		hashSet.add(new Student(20220001, "김준일", "부산대학교"));
		hashSet.add(new Student(20220002, "김준이", "부경대학교"));
		
		Iterator<Student> iterator = hashSet.iterator();
		
		while(iterator.hasNext()) {
			Student student = iterator.next();
			if(student.getStudentCode() == 20220002) {
				System.out.println(student);
			}
		
		}
		
		iterator = hashSet.iterator(); // 줄을 세워라는 뜻!
		
		while(iterator.hasNext()) {
			Student student = iterator.next();
			if(student.getStudentCode() == 20220001) {
				hashSet.remove(student);
			}
			
		} System.out.println(hashSet);
		
		
		
	}

}
