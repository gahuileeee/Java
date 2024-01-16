package sub1;
/*
 * ��¥	: 2024-01-16
 * �̸�	: �̰���
 * ����	: �ڹ� �Լ��� ���α׷��� �ǽ�
 * 
 * �Լ��� ���α׷���
 * - ���α׷��� ������ �Լ�(method) ���ַ� ���α׷��� �ϴ� �з�����
 * - �Լ��� ���α׷����� ���ٽ����� ����
 */

interface A{
	public void hello();
}

class B implements A{
	@Override
	public void hello() {
		System.out.println("���¾� ���");
	}
}
public class FunctionalTest {

		public static void main(String[] args) {
			// ��ü ���� ���α׷���
			A b = new B();
			b.hello();
			
			// �͸� ��ü (�������̽��� �ٷ� ��ü�� ����)
			A a =new A() {
				@Override
				public void hello() {
				System.out.println("�ʴ¾� ���");
				}
			};
			a.hello();
			
			// �Լ��� ���α׷��� (�ݵ�� Ÿ���� interface type�̾�� ��)
			A a3 = () -> {System.out.println("�츮�� ���");};
			a3.hello();
		}
}
