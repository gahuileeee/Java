package sub01;
/* 
 * 날짜 : 2024-01-02
 * 이름 : 이가희
 * 내용 : Java 클래스 실습
 */
public class Car {
	// 속성 ( 필드)
	String name;
	String color;
	int speed;
	
	// 기능 (메서드)
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
		System.out.println("차랑명 : "+this.name);
		System.out.println("차랑색 : "+this.color);
		System.out.println("현재속도 : "+this.speed);
	}
	public static void main(String[] args) {
	}

}
