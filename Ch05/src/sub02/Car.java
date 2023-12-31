package sub02;
/* 
 * 날짜 : 2024-01-02
 * 이름 : 이가희
 * 내용 : Java 클래스 실습
 */
public class Car {
	// 속성 ( 필드)
	private String name;
	private String color;
	private int speed;
	

	
	// 기능 (메서드)
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차랑명 : "+this.name);
		System.out.println("차랑색 : "+this.color);
		System.out.println("현재속도 : "+this.speed);
	}
	
	// 생성자
	public Car(String name, String color, int speed) {
		this.name=name;
		this.color=color;
		this.speed=speed;
	}
	
	public Car() {
		
	}
	


}
