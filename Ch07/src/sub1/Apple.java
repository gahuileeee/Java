package sub1;
// 암식적으로 Object class 를 상속받고 있는 것임. -> Object class method 쓸 수 있음.
public class Apple {

	public Apple(String country, int price) {
		super();
		this.country = country;
		this.price = price;
	}

	private String country;
	private int price;
	
	@Override
	public String toString() {
		System.out.println("해시값 : "+hashCode());
		System.out.println("원산지 : "+this.country);
		System.out.println("가격 : "+this.price);
	return super.toString();
	}
}
