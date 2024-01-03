package sub4;

public class Sedan extends Car{
//	Car class 를 상속함
//	정리하자면, Car class에서 cc , speedTurbo()를 추가함.
		private int cc;  //자식 클래스에서 확장시킨 속성
		public Sedan(String name, String color, int speed, int cc) {
			super(name, color, speed); // 부모 클래스 생성자 호출
			this.cc= cc;
		} //부모 생성자의 매개변수는 다 담아야 하며, 자식 클래스만의 속성을 더 추가하여도 된다.
		public void speedTurbo() {
			// protected 접근제한자를 쓰면 자식 class에서 접근 가능.
			this.speed += 20;
			}
		public void show() {
			super.show(); // 부모의 show() method 호출
			System.out.println("배기량 : " + cc); //추가
			System.out.println();
		}
}
