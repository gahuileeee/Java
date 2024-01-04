package sub7;

public class Truck extends Car{
//	Car�� �߻� method�� Sedan�� �����ؾ� ��.
	private int capacity;
	
	public Truck(String name, String color, int speed, int capacity) {
		super(name, color, speed);
		this.capacity=capacity;
	}
//	speed �����ϴ� ��. ���� �����ڸ� protected�� �ٲٴ���, getter setter�� �����ϱ�.
	@Override
	public void speedUp(int speed) {
		this.speed += speed;
	}

	@Override
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		super.show();
		System.out.println("���緮: "+capacity);
	}

}
