package sub5;

/* 
 * ��¥ : 2024-01-02
 * �̸� : �̰���
 * ���� : Java Ŭ���� �ǽ�
 */
public class Car {
	// �Ӽ� ( �ʵ�)
	protected String name;
	protected String color;
	protected int speed;

	
	// ��� (�޼���)
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	public void show() {
		System.out.println("������ : "+this.name);
		System.out.println("������ : "+this.color);
		System.out.println("����ӵ� : "+this.speed);
	}
	
	// ������
	public Car(String name, String color, int speed) {
		this.name=name;
		this.color=color;
		this.speed=speed;
	}
}
