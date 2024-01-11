package sub3;

import java.io.Serializable;

public class Apple implements Serializable {
	private static final long serialVersionUID = 1L;
	private String country;
	private int price;
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Apple [country=" + country + ", price=" + price + "]";
	}
	public void show() {
		System.out.println("---------------");
		System.out.println("������ : "+country);
		System.out.println("���� : "+price);
		System.out.println("---------------");
	}
}