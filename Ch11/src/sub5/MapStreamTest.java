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
		new Person("감자바",23),		
		new Person("김자바",28),		
		new Person("구자바",27),		
		new Person("금자바",33),		
		new Person("강자바",38)		
		);
		
		// map : Stream의 특정 요소를 다른 요소로 변환 (1:1)
		persons
		.stream()
		.map(person -> person.getName())
		.forEach(name -> System.out.print(name +" "));
		
		//flatMap: Stream의 특정 요소를 다른 여러 개의 요소로 변환 (1:N)
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
			.flatMap(list -> list.stream()) //평평하게 만들다. 여러 개의 리스트를 하나로 만들어주는 느낌
			.forEach(str -> System.out.print(str + ", "));
	}
}
