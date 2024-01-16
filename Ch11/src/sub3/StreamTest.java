package sub3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return this.name+" "+this.age;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class StreamTest {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("김유신");
		names.add("김춘추");
		names.add("장보고");
		names.add("강감찬");
		names.add("이순신");
		
		//외부 반복자를 이용한 출력 (메인 스레드를 통해서 실행됨)
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//내부 반복자를 이용한 출력 (그 자체의 스레드를 통해서 실행되기 때문에 호율 좋음)
		Stream<String> stream = names.stream();
		stream.forEach((name)->{
			System.out.println(name);
		});
		
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("김유신",23));
		persons.add(new Person("감유신",25));
		persons.add(new Person("궁유신",33));
		persons.add(new Person("계유신",22));
		persons.add(new Person("구유신",29));
		persons.add(new Person("강유신",21));
		
		//외부 반복자 처리
		for(Person person : persons) {
			System.out.println(person.getName()+" "+person.getAge());
		}
		System.out.println();
		
		//내부 반복자를 이용한 출력 
		Stream<Person> stream2 = persons.stream();
		stream2.forEach((person)->{System.out.println(person);
		}
		);
	}
}
