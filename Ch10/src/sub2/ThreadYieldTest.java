package sub2;

class SubThread1 extends Thread{
	
	@Override
	public void run() {
		for(int i=1; i<=1000; i++) {
			System.out.println("SubThread1 : "+ i);
			//�ٸ� �����忡�� ���� �纸
			Thread.yield();
		}
	}
}
class SubThread2 extends Thread{
	@Override
	public void run() {
		for(int i=1; i<=1000; i++) {
			System.out.println("SubThread2 : "+ i);
		}
	}
}
public class ThreadYieldTest {
	public static void main(String[] args) {
		SubThread1 sub1 = new SubThread1();
		SubThread2 sub2 = new SubThread2();
		
		sub1.start();
		sub2.start();
		
		
		try {
			sub1.join();
			sub2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("���α׷� ����.. ");
	}
}
