package sub1;
// �Ͻ������� Object class �� ��ӹް� �ִ� ����. -> Object class method �� �� ����.
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
		System.out.println("�ؽð� : "+hashCode());
		System.out.println("������ : "+this.country);
		System.out.println("���� : "+this.price);
	return super.toString();
	}
}
