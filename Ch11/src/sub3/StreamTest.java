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
		names.add("������");
		names.add("������");
		names.add("�庸��");
		names.add("������");
		names.add("�̼���");
		
		//�ܺ� �ݺ��ڸ� �̿��� ��� (���� �����带 ���ؼ� �����)
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//���� �ݺ��ڸ� �̿��� ��� (�� ��ü�� �����带 ���ؼ� ����Ǳ� ������ ȣ�� ����)
		Stream<String> stream = names.stream();
		stream.forEach((name)->{
			System.out.println(name);
		});
		
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("������",23));
		persons.add(new Person("������",25));
		persons.add(new Person("������",33));
		persons.add(new Person("������",22));
		persons.add(new Person("������",29));
		persons.add(new Person("������",21));
		
		//�ܺ� �ݺ��� ó��
		for(Person person : persons) {
			System.out.println(person.getName()+" "+person.getAge());
		}
		System.out.println();
		
		//���� �ݺ��ڸ� �̿��� ��� 
		Stream<Person> stream2 = persons.stream();
		stream2.forEach((person)->{System.out.println(person);
		}
		);
	}
}
