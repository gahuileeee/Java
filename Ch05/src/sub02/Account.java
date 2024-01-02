package sub02;

public class Account {

//	속성
	private String bank;
	private String id;
	private String name;
	private int balance;
	
//	생성자
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

	//	기능
	public void deposit(int money) {
		this.balance+= money;
	}
	
	public void withdraw(int money) {
		balance -=money;
	}
	
	public void show() {
		System.out.println("은행 : "+this.bank);
		System.out.println("계좌번호 : "+this.id);
		System.out.println("입금주 : "+this.name);
		System.out.println("현재잔액 : "+this.balance);
	}
}
