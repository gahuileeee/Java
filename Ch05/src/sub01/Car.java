package sub01;
/* 
 * ��¥ : 2024-01-02
 * �̸� : �̰���
 * ���� : Java Ŭ���� �ǽ�
 */
public class Car {
	// �Ӽ� ( �ʵ�)
	String name;
	String color;
	int speed;
	
	// ��� (�޼���)
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public Car(String name, String color, int speed) {
		this.name=name;
		this.color=color;
		this.speed=speed;
	}
	
	public Car() {
		
	}
	
	public void show() {
		System.out.println("������ : "+this.name);
		System.out.println("������ : "+this.color);
		System.out.println("����ӵ� : "+this.speed);
	}
	public static void main(String[] args) {
	}

}
