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
		 System.out.println("자식 스레드 종료..");
}
 }
public class ThreadJoinTest {
	
	public static void main(String[] args) {
		ChildThread ct = new ChildThread();
		ct.setName("sub");
		
		//자식 스레드 실행
		ct.start();
		
		// 자식 스레드 종료 대기
		try {
			ct.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		이렇게 join을 하게 되면 자식이 종료가 되고 Main이 종료가 됨.
		System.out.println("Main Thread 종료");		

	}
 
}