package sub02;

public class Account {

//	�Ӽ�
	private String bank;
	private String id;
	private String name;
	private int balance;
	
//	������
	public Account(String bank, String id, String name, int balance) {
		this.balance=balance;
		this.bank=bank;
		this.name=name;
		this.id=id;
	}
	
public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

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
