package sub6;
/* 
 * ��¥: 2024-01-03
 * �̸�: �̰���
 * ����: Java ������ �ǽ�
 */
public class PolyTest {
	public static void main(String[]args) {
		// ��ĳ�������� ������ ����
		Animal t = new Tiger();
		t.move();
		t.hunt();
		
		Animal e =new Eagle();
		e.move();
		e.hunt();
		
		Animal s = new Shark();
		s.move();
		s.hunt();
		
		//��ü Ÿ�� �� ����
		if(t instanceof Tiger) System.out.println("�½��ϴ�");
		
		if(e instanceof Eagle) System.out.println("�½��ϴ�");
		
		if(s instanceof Shark) System.out.println("�½��ϴ�");
	}
}
