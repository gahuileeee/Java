package sub5;
/*
 * ��¥: 2024-01-03
 * �̸�: �̰���
 * ����: Java �޼��� �������̵� �ǽ�
 */
class AAA{
	public void method1() {
		System.out.println("AAA: method1");
	}
	public void method2() {
		System.out.println("AAA: method2");
	}
	public void method3() {
		System.out.println("AAA: method3");
	}
}
class BBB extends AAA{
	@Override
	public void method2() {
		System.out.println("BBB: method2");
	}
	//Overload
	public void method3(int a) {
		System.out.println("BBB: method3");
	}
}
class CCC extends BBB{
	@Override
	public void method1() {
		System.out.println("CCC: method1");
	}
	@Override
	public void method2() {
		System.out.println("CCC: method2");
	}
	//Overload
	public void method3(int a, int b) {
		System.out.println("CCC: method3");
		System.out.println();
	}
}

public class OverrideTest {
	
	public static void main(String[]args) {
		// Overload, Override 
		CCC c = new CCC();
		c.method1();
		c.method2();
		c.method3();
		c.method3(0);
		c.method3(1,2);
		
		// Override ���� ��ü ����
		Sedan sonata = new Sedan("�ҳ�Ÿ", "���", 0, 2000);
		Truck bongo = new Truck("����", "����", 0, 0);
		
		sonata.speedUp(80);
		sonata.show();
		bongo.speedDown(60);
		bongo.show();
	}

}
