package sub4;

public class Account {
	protected String bank;
	protected String id;
	protected String name;
	protected int balance;
	
	public Account(String bank, String id, String name, int balance) {
		this.balance = balance;
		this.bank= bank;
		this.id=id;
		this.name=name;
	}
	public void deposit(int money) {
		balance+=money;
	}
	public void withdra(int money) {
		balance-=money;
	}
	public void show() {
		System.out.println("����� : "+bank);
		System.out.println("������� : "+id);
		System.out.println("�Ա��� : "+name);
		System.out.println("���� �ܾ� : "+balance);
	}
}
