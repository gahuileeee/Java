package sub02;


public class EnCapsuleTest {
	
	public static void main(String[]args) {
//		��ü ����
		Car avante = new Car();
		
//		avante.name="�ƹ���";
//		avante.color="���";
//		avante.speed=10;
//		private ���� �����ڰ� �־� �������� ������ �Ұ���

//		ĸ��ȭ�� �Ӽ��� ���� �ʱ�ȭ�� �����ڿ��� ����
		Car sonata = new Car("�ҳ�Ÿ","���",10);
		sonata.setName("�ҳ�Ÿ");
		sonata.setColor("���");
		sonata.setSpeed(20);
		sonata.show();
		
		System.out.println();
		Account kb = new Account("��������", "123-10-1001","�̰���",1000);
		kb.deposit(9000);
		kb.withdraw(200);
		kb.show();
	}
}
