package sub7;

/*	
 * �߻�Ŭ����
 * - �߻� �޼��带 ���� Ŭ����
 * - ������� ���Ǵ� Ŭ����
 * 
 */
public abstract class Car {
		protected String name;
		protected String color;
		protected int speed;
		
		public Car (String name, String color, int speed) {
			this.name= name;
			this.color=color;
			this.speed= speed;
		}
		
//		�߻� method
		public abstract void speedUp(int speed); 
		public abstract void speedDown(int speed);
		
		public void show() {
			System.out.println("������ : "+this.name);
			System.out.println("������ : "+this.color);
			System.out.println("����ӵ� : "+this.speed);
		}
}
