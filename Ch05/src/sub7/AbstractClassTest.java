package sub7;

/* 
 * ��¥ : 2024-01-04
 * �̸� : �̰���
 * ���� : �߻�Ŭ���� �ǽ�
 */
public class AbstractClassTest {

	public static void main(String[] args) {
//		�߻�Ŭ������ ��ü ������ �ȵ�
//		Car car = new Car("�ҳ�Ÿ","���",0);
		Car sonata = new Sedan("�ҳ�Ÿ","���",0,2000);
		Car bongo = new Truck("����","����",0,0);
		
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		bongo.speedUp(60);
		bongo.speedDown(10);
		bongo.show();
	}
}
	