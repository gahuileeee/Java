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
		System.out.println("은행명 : "+bank);
		System.out.println("은행계좌 : "+id);
		System.out.println("입금주 : "+name);
		System.out.println("현재 잔액 : "+balance);
	}
}
