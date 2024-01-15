package sub4;

public class Store {
	private int count =0;
	private int max =3;
	private int min =0;
	
	public synchronized void produce() {
		System.out.println("���� ��: "+count);
		while(count>=max) {
			
			try {
				System.out.println("produce ���..1");
				// ���� ���� ������� ��� ���·� ��ȯ
				wait();
				System.out.println("produce ���..2");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		count++;
		//��� ������ �����带 ���� �غ���·� ��ȯ
		notifyAll();
		System.out.println("���� �� : "+count);
	}
		public synchronized void consume() {
			System.out.println("�Һ� ��: "+count);
			while(count<=min) {
				
				try {
					System.out.println("consume ���..1");
					wait();
					System.out.println("consume ���..2");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			count--;
			notifyAll();
			System.out.println("�Һ� �� : "+count);
		}
	}
	

