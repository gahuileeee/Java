package sub2;

 class ChildThread extends Thread{
	 @Override
	public void run() {

		 for(int i=1; i<=10; i++) {
				System.out.println("i : "+i);
				try {
					sleep(1000);
				}catch(Exception e) {
					e.printStackTrace();
				}
		 }
		 System.out.println("�ڽ� ������ ����..");
}
 }
public class ThreadJoinTest {
	
	public static void main(String[] args) {
		ChildThread ct = new ChildThread();
		ct.setName("sub");
		
		//�ڽ� ������ ����
		ct.start();
		
		// �ڽ� ������ ���� ���
		try {
			ct.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		�̷��� join�� �ϰ� �Ǹ� �ڽ��� ���ᰡ �ǰ� Main�� ���ᰡ ��.
		System.out.println("Main Thread ����");		

	}
 
}