package sub3;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("����");
		list.add("����");
		list.add("�뱸");
		list.add("�λ�");
		list.add("����");
		
		System.out.println(list);
		
//		data add
		list.add(1, "����");
		list.add(1, "����");
		System.out.println(list);
	}
}
