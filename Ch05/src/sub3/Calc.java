package sub3;

public class Calc {
	
//	�̱��� ��ü ����--------------------
//	�ش� Ŭ���� ������ �������� ��ü�� �����ϴ� ��
	private static Calc instance = new Calc();
	
	public static Calc getInstance() {
		return instance;
	}
	private  Calc() {}
	
//	�̷��� ������ �̱��� set--------------
	
	public int plus(int x, int y) {
		return x+y;
	}
	public int minus(int x, int y) {
		return x-y;
	}
	public int multi(int x, int y) {
		return x*y;
	}
	public int div(int x, int y) {
		return x/y;
	}
	
	public static void main(String[]args) {
		 
	}
}
