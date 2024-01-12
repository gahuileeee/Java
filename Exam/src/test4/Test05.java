package test4;
/*
 * ��¥ : 2024-01-12
 * �̸� : �̰���
 * ���� : �ڹ� API Ŭ���� ��������
 */
class Apple{
	private String country;
	private int price;
	
	public Apple(String a, int b) {
		this.country=a;
		this.price=b;
	}
	
	@Override
	public String toString() {
		return "Apple [country="+country+", price="+price+"]";
	}
}

class Banana{
	private String country;
	private int price;
	
	public Banana(String a, int b) {
		this.country=a;
		this.price=b;
	}
	
	@Override
	public String toString() {
		return "Apple [country="+country+", price="+price+"]";
	}
}

class Grape{
	private String country;
	private int price;
	
	public Grape(String a, int b) {
		this.country=a;
		this.price=b;
	}
	
	@Override
	public String toString() {
		return "Apple [country="+country+", price="+price+"]";
	}
}
public class Test05 {
	public static void main(String[] args) {
		Apple apple = new Apple("�ѱ�",3000);
		Banana banana = new Banana("�̱�", 2000);
		Grape grape = new Grape("�Ϻ�", 1000);
		
		showInfo(apple);
		showInfo(banana);
		showInfo(grape);
	}
	public static void showInfo(Object fruit) {
		if(fruit instanceof Apple) {
			Apple apple = (Apple) fruit;
			System.out.println(apple);
		}else if(fruit instanceof Banana) {
			Banana banana = (Banana) fruit;
			System.out.println(banana);
		}else if(fruit instanceof Grape) {
			Grape grape = (Grape) fruit;
			System.out.println(grape);
		}
	}

}
