package sub1;
/*
 * ��¥ : 2024-01-09
 * �̸� : �̰���
 * ���� : Object class �ǽ�
 */
public class ObjectTest {

	public static void main(String[] args) {
		
		Object a1 = new Apple("�ѱ�",3000);
		Object a2 = new Apple("�Ϻ�",2000);
		
		a1.toString();
		a2.toString();
		
//		��ü ��
		
//		 a1�� a2�� �Ҵ���� �ּҸ� ��.(stack�� ���� ��)
		if(a1 == a2) {
			System.out.println("a1, a2 �ּҰ� ����.");
		}else {
			System.out.println("a1, a2 �ּҰ� �ٸ���.");
		}
		
//		a1�� ����Ű�� instance�� a2�� ����Ű�� instance(heap�� ��)�� ��.
		if(a1.equals(a2)) {
			System.out.println("a1, a2�� ����.");
		}else {
			System.out.println("a1, a2�� �ٸ���.");
		}
	}
}
