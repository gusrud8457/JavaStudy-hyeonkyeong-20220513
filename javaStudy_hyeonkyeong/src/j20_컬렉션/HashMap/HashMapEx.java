package j20_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer,String> studentMap = new HashMap<Integer,String>();
		
		//값 추가
		studentMap.put(20, "김준일"); //키 값이 중복이 된다면 마지막 값만 추가
		studentMap.put(10, "김준이"); //값이 중복이 되면 전체가 출력됨
		studentMap.put(22, "김준삼"); 
		studentMap.put(33, "김준사");
		studentMap.put(44, "김준오");

		System.out.println(studentMap);
		System.out.println("*******************");
		
		//Key로 value 가져오기
		System.out.println(studentMap.get(10)); 
		System.out.println("*******************");
		
		//수정
		studentMap.put(10, "정현경"); //원하는 키 값에 값이 없으면 추가 됨
		studentMap.replace(10, "김준칠"); // 원하는 키 값이 없으면 추가 안함
		studentMap.remove(10);
		
		Iterator<Integer> iterator = studentMap.keySet().iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			String value = studentMap.get(key);
//			if(value.equals("김준오")) {
//				System.out.println(studentMap.get(key));
//			}
			System.out.println(value);
			System.out.println("*******************");
		}
		
		
		
		//람다식(함수형 프로그래밍)
		studentMap.forEach(
			(k, v) -> {
				System.out.println("key : " + k);
				System.out.println("value : " + v);
				System.out.println("*******************");
			}
		);
		
		System.out.println(studentMap.containsKey(22));
		System.out.println(studentMap.containsValue("김준구"));
		}
		
	
	
	
	}


