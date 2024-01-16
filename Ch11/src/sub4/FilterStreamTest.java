package sub4;

import java.util.Collections;
import java.util.List;

public class FilterStreamTest {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,1,2,3);
		System.out.println(numbers);
		
		//�ߺ�����
//		List<Integer> numbers2 = numbers.stream().distinct().toList();
//		System.out.println(numbers2);
		numbers.stream().distinct().forEach(num->System.out.print(num+", "));
		
		//5�̻� ������ ���͸�
		numbers
			.stream()
			.filter((num)-> num>=5) //5���� ũ�� true�� return
			.forEach(num -> System.out.print(num +", "));
		System.out.println();
		//�ߺ� �����ϰ� ¦�� �����͸� ���, �������� ����
		numbers
			.stream()
			.distinct()
			.filter((num) -> {if(num%2==0) return true;
			return false;})   // �̰Ÿ� �׳� num -> num%2==0 �̷��� ���̸� ��.
			.sorted(Collections.reverseOrder())
			.forEach(num -> System.out.print(num + ", "));
	}	
}
