package sub01;
/* 
 * ��¥ : 2024-01-02
 * �̸� : �̰���
 * ���� : Java Ŭ���� �ǽ�
 */
public class ClassText {

	public static void main(String[]args) {


//		��ü ���� �� ��ü �ʱ�ȭ
		Car sonata = new Car();
		sonata.name= "�ҳ�Ÿ";
		sonata.color= "���";
		sonata.speed= 0;
		
//		��ü ��ȣ�ۿ�
		sonata.speedUp(60);
		sonata.speedDown(20);
		sonata.show();
		
//		��ü ������ ���ÿ� �ʱ�ȭ, ��ȣ�ۿ�
		System.out.println();
		Car avante = new Car("�ƹ���","������",0);
		avante.speedUp(80);
		avante.speedDown(20);
		avante.show();
		
//		Account ��ü ����/ �ʱ�ȭ/ ��ȣ�ۿ�
		System.out.println();
		Account kb = new Account();
		kb.bank = "��������";
		kb.id="101-12-00112";
		kb.name="�̰���";
		kb.balance= 10000;
		
		kb.deposit(40000);
		kb.withdraw(3000);
		kb.show();
	}
}
