package sub4;

public class Sedan extends Car{
//	Car class �� �����
//	�������ڸ�, Car class���� cc , speedTurbo()�� �߰���.
		private int cc;  //�ڽ� Ŭ�������� Ȯ���Ų �Ӽ�
		public Sedan(String name, String color, int speed, int cc) {
			super(name, color, speed); // �θ� Ŭ���� ������ ȣ��
			this.cc= cc;
		} //�θ� �������� �Ű������� �� ��ƾ� �ϸ�, �ڽ� Ŭ�������� �Ӽ��� �� �߰��Ͽ��� �ȴ�.
		public void speedTurbo() {
			// protected ���������ڸ� ���� �ڽ� class���� ���� ����.
			this.speed += 20;
			}
		public void show() {
			super.show(); // �θ��� show() method ȣ��
			System.out.println("��ⷮ : " + cc); //�߰�
			System.out.println();
		}
}
