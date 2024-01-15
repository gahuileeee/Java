package sub4;

public class ThreadWaitTest {
	public static void main(String[] args) {
		Store store = new Store();
		
		Thread producer = new Producer(store);
		Thread consumer = new Consumer(store);
		
		producer.start();
		consumer.start();
		
		try {
			producer.join();
			consumer.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
