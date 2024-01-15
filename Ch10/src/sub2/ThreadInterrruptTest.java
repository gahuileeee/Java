package sub2;

 class SubThread extends Thread{
	 @Override
	public void run() {
		 int i=1;
		 while(true) {
			 try {
					System.out.println("i : "+i);
					i++;
						sleep(1000);
				}
			 catch (InterruptedException e) {
					e.printStackTrace();
				}
			 
		 }
	
	}
	
}
public class ThreadInterrruptTest {
	
	public static void main(String[] args) {
		SubThread sub = new SubThread();
		sub.setName("sub");
		
		//�ڽ� ������ ����
		sub.start();
		System.out.println("���� ������ ����");
		
		try {
			//���� ������ 10�� �Ͻ� ����
			Thread.sleep(1000*10);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//�ڽ� ������ ����
		sub.interrupt();
		
		System.out.println("Main Thread ����");
		
	}

}
