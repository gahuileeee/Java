package sub2;
/*
 * ��¥ : 2024-01-16
 */

@FunctionalInterface
interface A {
	public int method(int a, int b);
}
@FunctionalInterface
interface B {
	public int method(String s);
}
@FunctionalInterface
interface C {
	public boolean method();
}
@FunctionalInterface
interface D {
	public void method();
}
@FunctionalInterface
interface E {
	public double method(double num);
}
public class LambdaTest {
	public static void main(String[] args) {
		//���ٽ� ����
		A a1 = (int a, int b) -> {
			return a+b;
		};
		A a2 = (a, b) -> {return a+b;};
		A a3 = (a,b) -> a+b;
		//�̷��� �����ϰ� ǥ���� ���� ����
		
		int r1= a1.method(1, 1);
		int r2= a2.method(1, 1);
		int r3 =a3.method(2, 3);
		
		System.out.println(r1+" "+r2+" "+r3);
		
		C c1 = () -> {return true;};
		C c2 = () -> false;
		System.out.println(c1.method() +" "+c2.method());
		
		D d1 = () -> {System.out.println("d1 ����..");};
		D d2 = () -> System.out.println("d2 ����..");
		d1.method();
		d2.method();
		
		// �޼��� ���� ������ 
		E e1 = (n)-> Math.ceil(n);
		E e2 = Math::ceil;
		E e3 = Math::floor;
		E e4 = Math::round;
		
		double n1 =e1.method(1.2);
		double n2 =e2.method(1.2);
		double n3 =e3.method(1.2);
		double n4 =e4.method(1.2);
		System.out.println(n1 +" "+ n2 + " "+ n3 +" "+ n4);
		
		//���ٽ� Ȱ��
		Runnable run = () -> {
			for(int i=1; i<=10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("���� ������ ����....");
			}
		};
		
		Thread th = new Thread(run);
		th.start();
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("���� ������ ����....");
		}
		
		try {
			th.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("���� ������ ����");
	}
}
