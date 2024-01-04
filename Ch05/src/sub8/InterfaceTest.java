package sub8;

/* ��¥ : 2024-01-04
 * �̸� : �̰���
 * ���� : �������̽� �ǽ�
 */


	class Computer{
		public void boot() {
			System.out.println("�ý��� ����..");
		}
	}
	
	interface Internet{
		public void access();
	}
	interface Audio{
		public void access2();
	}
	class Tv extends Computer implements Internet,Audio{
		@Override
		public void access() {
			System.out.println("���ͳ� ����..");
		}
		@Override
		public void access2() {
			System.out.println("����� ��û..");
		}
		public void show() {
			System.out.println("Tv ��û..");
		}
	}


public class InterfaceTest {
	public static void main(String[] args) {
		
		// �������̽� ���� 1 - ǥ��ȭ�� Ŭ���� ����
			RemoteControl lg = new RemoteLG();
			lg.powerOn();
			lg.chUp();
			lg.soundDown();
			lg.powerOff();
			
			RemoteControl s = new RemoteSamsung();
			s.powerOn();
			s.chDown();
			s.soundDown();
			s.powerOff();
		
		// �������̽� ���� 2 - ������ (���յ� ��ȭ)
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		socket.switchOn();
		socket.switchOff();
		
		// �������̽� ���� 3 - ���� ��� ȿ��
		Tv smartTv = new Tv();
		//Computer smartTv = new Tv(); boot �����ϰ� ���� ����.
		smartTv.boot();
		smartTv.access();
		smartTv.access2();
		smartTv.show();
	}
}
