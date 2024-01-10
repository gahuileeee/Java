package sub3;

import java.util.ArrayList;
import java.util.List;

import sub1.Apple;

public class ArrayListTest {

	public static void main(String[] args) {
		
//		ArrayList ����
		ArrayList<Integer> list = new ArrayList<>();
		
//		������ �Է�
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list);
		
//		������ ����
		list.add(1,6);
		System.out.println(list);
		
//		������ ����
		list.remove(2); //index��
		System.out.println(list);
		
//		 ������ ����
		System.out.println("1��° ���� : "+list.get(0));
		System.out.println("2��° ���� : "+list.get(1));
		System.out.println("4��° ���� : "+list.get(3));
		
//		list size
		System.out.println("list ũ�� : "+list.size());
		
//		list �ݺ���
		for(int num : list) {
			System.out.print(num +" ");
		}
		
//		���ڿ� ����Ʈ
		List<String> people = new ArrayList<>();
		people.add("������");
		people.add("������");
		people.add("���庸��");
		System.out.println(people);
		
//		��ü ����Ʈ
		List<Apple> apples = new ArrayList<>();
		Apple a1 = new Apple("�ѱ�",3000);
		Apple a2 = new Apple("�ѱ�",3000);
		Apple a3 = new Apple("�ѱ�",3000);
		
		apples.add(a1);
		apples.add(a2);
		apples.add(a3);
		
	}
	
}
