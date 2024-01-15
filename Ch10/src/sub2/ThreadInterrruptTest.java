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
		
		//자식 스레드 실행
		sub.start();
		System.out.println("메인 스레드 시작");
		
		try {
			//메인 스레드 10초 일시 정지
			Thread.sleep(1000*10);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//자식 스레드 종로
		sub.interrupt();
		
		System.out.println("Main Thread 종료");
		
	}

}
