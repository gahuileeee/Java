package sub5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		
//		Map ����
		Map <Character,String> map = new HashMap<>();
//		������ �Է�
		map.put('A',"Apple");
		map.put('B',"Banana");
		map.put('C',"Cherry");
		
		System.out.println(map);
		
//		Map ũ��
		System.out.println("map ũ�� : "+map.size());
		
//		Map data ����
		System.out.println("Map A�� "+ map.get('A'));
		System.out.println("Map A�� "+ map.get('B'));
		System.out.println("Map A�� "+ map.get('C'));
		
//		Map �ݺ���
		for(char k : map.keySet()) {
			System.out.println(k +" - "+map.get(k));
		}
		
//		List �� Map�� �̿��� �ڷᱸ��
		List<Map<Integer,Apple>> myList = new ArrayList<>();
		
		Map<Integer,Apple> m1 = new HashMap<>();
		m1.put(101,new Apple("�ѱ�",3000));
		m1.put(102,new Apple("�߱�",3000));
		m1.put(103,new Apple("�Ϻ�",3000));
		
		Map<Integer,Apple> m2 = new HashMap<>();
		m2.put(201,new Apple("�̱�",3000));
		m2.put(202,new Apple("����",3000));
		m2.put(203,new Apple("ȣ��",3000));
		
		Map<Integer,Apple> m3 = new HashMap<>();
		m3.put(301,new Apple("�븸",3000));
		m3.put(302,new Apple("�±�",3000));
		m3.put(303,new Apple("�ε�",3000));
		
		myList.add(m1);
		myList.add(m2);
		myList.add(m3);
		
		System.out.println(myList);
		
//		�ѱ� ��� ������
		Map<Integer, Apple> resultMap1 = myList.get(0);
		Apple apple1 = resultMap1.get(101);
		apple1.show();
		
//		ȣ�� ��� ������
		Map<Integer, Apple> resultMap2 = myList.get(1);
		Apple apple2 = resultMap2.get(203);
		apple2.show();
		myList.get(1).get(203).show(); //�̷��� �� �ٷ� ǥ���� ���� ����
		
//		�±� ��� ������
		myList.get(2).get(302).show();
	}
}
