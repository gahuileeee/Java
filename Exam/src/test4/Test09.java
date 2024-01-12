package test4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * ��¥ : 2024-01-12
 * �̸� : �̰���
 * ���� : �÷��� ��������
 */

class Orange{
	private String country;
	private int price;
	public Orange(String country, int price) {
		super();
		this.country = country;
		this.price = price;
		
	}
	public void show() {
		System.out.println("������ : "+country);
		System.out.println("���� : "+price);
	}
}
public class Test09 {
	public static void main(String[] args) {
		List<Orange> list1 = new ArrayList<>();
		list1.add(new Orange("����",3000));
		list1.add(new Orange("��õ",3000));
		list1.add(new Orange("����",3000));
		
		List<Orange> list2 = new ArrayList<>();
		list2.add(new Orange("û��",3000));
		list2.add(new Orange("����",3000));
		list2.add(new Orange("�ܾ�",3000));

		List<Orange> list3 = new ArrayList<>();
		list3.add(new Orange("�о�",3000));
		list3.add(new Orange("�Ծ�",3000));
		list3.add(new Orange("��õ",3000));
		
		Map<String,List<Orange>> map = new HashMap<>();
		map.put("gyeonggi", list1);
		map.put("chungbuk", list2);
		map.put("gyungnam", list3);
		
		List<Orange> list = map.get("gyeonggi");
		Orange orange = list.get(2);
		orange.show();
		
		map.get("chungbuk").get(1).show();
		map.get("gyungnam").get(0).show();
	}
}
