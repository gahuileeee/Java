package sub01;

public class Account {

//	�Ӽ�
	String bank;
	String id;
	String name;
	int balance;
	
	
//	���
	public void deposit(int money) {
		this.balance+= money;
	}
	
	public void withdraw(int money) {
		balance -=money;
	}
	
	public void show() {
		System.out.println("���� : "+this.bank);
		System.out.println("���¹�ȣ : "+this.id);
		System.out.println("�Ա��� : "+this.name);
		System.out.println("�����ܾ� : "+this.balance);
	}
}
