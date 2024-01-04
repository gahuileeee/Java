package sub7;

public class Sedan extends Car{
//	Car�� �߻� method�� Sedan�� �����ؾ� ��.
	private int cc;
	
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed);
		this.cc=cc;
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
		System.out.println("���� ��ⷮ: "+cc);
	}

}
