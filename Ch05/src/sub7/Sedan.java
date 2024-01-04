package sub7;

public class Sedan extends Car{
//	Car의 추상 method를 Sedan이 구현해야 함.
	private int cc;
	
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed);
		this.cc=cc;
	}
//	speed 참조하는 법. 접근 제한자를 protected로 바꾸던가, getter setter를 설정하기.
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
		System.out.println("현재 배기량: "+cc);
	}

}
