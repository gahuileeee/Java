package ch1;

 public class Account {
	private String anum;   //계좌번호
	private String owner;	//계좌주	
	private int balance;	// 초기입금액
	
	//생성자 생성
	public Account(String anum, String owner, int balance) {
		this.anum = anum;
		this.owner = owner;
		this.balance = balance;
	}
	//toString Override
	@Override
	public String toString() {
		return this.anum+"  "+this.owner+"  "+this.balance;
	}
	
	//Getter / Setter 생성
	public String getAnum() {
		return anum;
	}
	public void setAnum(String anum) {
		this.anum = anum;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
 }



