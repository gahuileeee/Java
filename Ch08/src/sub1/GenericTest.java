package sub1;
/*
 * ��¥ : 2024-01-10
 * �̸� : �̰���
 * ���� : Java generic �ǽ�
 */
public class GenericTest {
	public static void main(String[] args) {
		
		Apple a = new Apple("�ѱ�",3000);
		Banana b = new Banana("�Ϻ�",2500);
		
		FruitBox<Apple> box1 = new FruitBox<>();
		FruitBox<Banana> box2 = new FruitBox<>();
		
		box1.setFruit(a);
		box2.setFruit(b);
		
		System.out.println("box1 ���� : "+box1.getFruit());
		System.out.println("box2 ���� : "+box2.getFruit());
	}
}
