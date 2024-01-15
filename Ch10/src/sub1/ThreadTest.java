package sub1;
/*
 * ��¥ 	: 2024-01-15	
 * �̸�	: �̰���
 * ����	: Thread �ǽ�
 *
 */

class SubThread extends Thread{
	@Override
	public void run() {
		// �ڽ� ������� ������ ����
		
		for(int i=1; i<=15; i++) {
			System.out.println(getName()+"������ ����...");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(getName() + "������ ����...");
	};
}
public class ThreadTest {
	public static void main(String[] args) throws InterruptedException {
		
		// Thread ����
		SubThread st1 = new SubThread();
		SubThread st2 = new SubThread();
		
		st1.setName("Sub1");
		st2.setName("Sub2");
		//���� ������ ����
		st1.setDaemon(true);
		st2.setDaemon(true);

		st1.start();
		st2.start();
		for(int i=1; i<=10; i++) {
			System.out.println("Main ������ ����..");
			Thread.sleep(1000);
		
		}
		System.out.println("���α׷� ����...");
	}
}
