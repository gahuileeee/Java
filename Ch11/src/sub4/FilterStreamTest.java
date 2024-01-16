package sub4;

import java.util.Collections;
import java.util.List;

public class FilterStreamTest {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,1,2,3);
		System.out.println(numbers);
		
		//중복제거
//		List<Integer> numbers2 = numbers.stream().distinct().toList();
//		System.out.println(numbers2);
		numbers.stream().distinct().forEach(num->System.out.print(num+", "));
		
		//5이상 데이터 필터링
		numbers
			.stream()
			.filter((num)-> num>=5) //5보다 크면 true를 return
			.forEach(num -> System.out.print(num +", "));
		System.out.println();
		//중복 제거하고 짝수 데이터만 출력, 내림차순 정렬
		numbers
			.stream()
			.distinct()
			.filter((num) -> {if(num%2==0) return true;
			return false;})   // 이거를 그냥 num -> num%2==0 이렇게 줄이면 됨.
			.sorted(Collections.reverseOrder())
			.forEach(num -> System.out.print(num + ", "));
	}	
}
