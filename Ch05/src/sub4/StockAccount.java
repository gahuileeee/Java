package sub4;

public class StockAccount extends Account{
	private String stock;
	private int amount;
	private int price;
	public StockAccount(String bank, String id, String name, 
			int balance, String stock, int amount, int price) {
		super(bank, id, name, balance);
		this.stock=stock;
		this.amount=amount;
		this.price=price;
	}
	
	public void sell(int amount, int price) {
		this.amount -= amount; //�ֽ��� �Ⱦ���
		this.balance += amount * price;
	}
	public void buy(int amount, int price) {
		this.amount+= amount;
		this.balance -= amount * price;
		
	}
	public void show() {
		super.show();
		System.out.println("�ֽ����� : "+this.stock);
		System.out.println("�ֽļ��� : "+this.amount);
		System.out.println("�ֽİ��� : "+this.price);
	}

	 
}
