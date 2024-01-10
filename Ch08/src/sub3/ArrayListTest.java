package sub3;

import java.util.ArrayList;
import java.util.List;

import sub1.Apple;

public class ArrayListTest {

	public static void main(String[] args) {
		
//		ArrayList 생성
		ArrayList<Integer> list = new ArrayList<>();
		
//		데이터 입력
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list);
		
//		데이터 삽입
		list.add(1,6);
		System.out.println(list);
		
//		데이터 삭제
		list.remove(2); //index임
		System.out.println(list);
		
//		 데이터 추출
		System.out.println("1번째 원소 : "+list.get(0));
		System.out.println("2번째 원소 : "+list.get(1));
		System.out.println("4번째 원소 : "+list.get(3));
		
//		list size
		System.out.println("list 크기 : "+list.size());
		
//		list 반복문
		for(int num : list) {
			System.out.print(num +" ");
		}
		
//		문자열 리스트
		List<String> people = new ArrayList<>();
		people.add("김유신");
		people.add("김춘추");
		people.add("김장보고");
		System.out.println(people);
		
//		객체 리스트
		List<Apple> apples = new ArrayList<>();
		Apple a1 = new Apple("한국",3000);
		Apple a2 = new Apple("한국",3000);
		Apple a3 = new Apple("한국",3000);
		
		apples.add(a1);
		apples.add(a2);
		apples.add(a3);
		
	}
	
}
