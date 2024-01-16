package sub5;

import java.util.Arrays;
import java.util.List;

class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return this.name+" "+this.age;
	}
}
public class MapStreamTest {
	public static void main(String[] args) {
		List<Person> persons = List.of(
		new Person("���ڹ�",23),		
		new Person("���ڹ�",28),		
		new Person("���ڹ�",27),		
		new Person("���ڹ�",33),		
		new Person("���ڹ�",38)		
		);
		
		// map : Stream�� Ư�� ��Ҹ� �ٸ� ��ҷ� ��ȯ (1:1)
		persons
		.stream()
		.map(person -> person.getName())
		.forEach(name -> System.out.print(name +" "));
		
		//flatMap: Stream�� Ư�� ��Ҹ� �ٸ� ���� ���� ��ҷ� ��ȯ (1:N)
		List<String> strList = List.of("1,2,3","4,5,6","7,8,9,10");
		int result = strList
			.stream()
			.flatMapToInt((str)->{
				String [] strArr =str.split(",");
				int [] nums = new int[strArr.length];
				for(int i=0; i<strArr.length; i++) {
					nums[i]=Integer.parseInt(strArr[i]);
				}
				return Arrays.stream(nums);
			}).sum();
		System.out.println();
		System.out.println(result);
		
		List<List<String>> nestedList = Arrays.asList(
				Arrays.asList("apple","banana"),
				Arrays.asList("orange","grape"),
				Arrays.asList("peach","melon")
				);
		nestedList.stream()
			.flatMap(list -> list.stream()) //�����ϰ� �����. ���� ���� ����Ʈ�� �ϳ��� ������ִ� ����
			.forEach(str -> System.out.print(str + ", "));
	}
}
