package sub1;
/*
 * 날짜 	: 2024-01-15	
 * 이름	: 이가희
 * 내용	: Thread 실습
 *
 */

class SubThread extends Thread{
	@Override
	public void run() {
		// 자식 스레드로 실행할 로직
		
		for(int i=1; i<=15; i++) {
			System.out.println(getName()+"스레드 실행...");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(getName() + "스레드 종료...");
	};
}
public class ThreadTest {
	public static void main(String[] args) throws InterruptedException {
		
		// Thread 생성
		SubThread st1 = new SubThread();
		SubThread st2 = new SubThread();
		
		st1.setName("Sub1");
		st2.setName("Sub2");
		//데몬 스레드 설정
		st1.setDaemon(true);
		st2.setDaemon(true);

		st1.start();
		st2.start();
		for(int i=1; i<=10; i++) {
			System.out.println("Main 스레드 실행..");
			Thread.sleep(1000);
		
		}
		System.out.println("프로그램 종료...");
	}
}
