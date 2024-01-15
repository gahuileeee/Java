package sub3;
/*
 * ����(Syncronize)   
 * - ���� ����� ������ ���� ���ʴ�� ó���Ǵ� ���� �帧
 * - �ü�� �����ٸ� ��
 *  ������ ������ ���� (���� ������ �ְ� ����)
 *  
 * �񵿱�(Asyncronize) 
 * - �񵿱����� ������ ������� ó���Ǵ� ���� �帧
 * - �� �񵿱� ��� ��
 *  ŰĿ�� ��Ű�� ���� (���� ���� �ְ� ���� ����)
 *  
 */

class Count{
	private int num;
	public int getNum() {
		return num;
	}
	/*
	 * �Ӱ迵�� 
	 *  - ��Ƽ �����忡 ���� �����ڿ��� �����Ǵ� �ڵ��� ����
	 *  - �����尣 ������ �߻�
	 *  - ����ȭ ó���� �����ؼ� ��� �� �����尡 ����ϸ� Lock�� �ɾ� �ٸ� �������� ħ���� ����
	 *  - �ʹ� ���� �����尡 �߻��� ��� ��������(DeadLock)�� ���� �� ����
	 */
	public synchronized void setNum() {
		num++;
	}
}

class CountThread extends Thread{
	private Count count;
	public CountThread(Count count) {
		this.count= count;
	}
	
	@Override
	public void run() {
	for(int i=1;  i<=1000 ; i++) {
		count.setNum();
	}
	
	}
}
public class ThreadSyncTest {

	public static void main(String[] args) {
		Count count = new Count();
		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);
		
		ct1.start();
		ct2.start();
		ct3.start();
		
		try {
			ct1.join();
			ct2.join();
			ct3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("count : "+count.getNum());
	}
}
