package sub3;
/*
 *  ��¥: 2023-12-29
 *  �̸�: �̰���
 *  ����: �޼��� ���� �ǽ�
 */
public class MethodTypeTest {

	public static void main(String[] args) {
		
		System.out.println("�������� 5.0cm�� ���� ���� : "+type1(5.0)+"cm2");
		System.out.print("0�� 1���� ũ�ٴ� ���� "); type2(0>1);
		if(type3()) System.out.println("num1�� num2���� Ů�ϴ�.");
		else System.out.println("num1�� num2���� �۽��ϴ�.");
		type4();
	}
	
	// type1 : �Ű����� O, ���ϰ� O
	public static double type1(double x) {
		return (x*x) * 3.1415926535;
	}
	
	// type1 : �Ű����� O, ���ϰ� X
	public static void type2(boolean status) {
		if(status) {
			System.out.println("�� �Դϴ�.");
		}else {
			System.out.println("�����Դϴ�");
		}
	}
	// type1 : �Ű����� X, ���ϰ� O
	public static boolean type3() {
		int num1 = 1;
		int num2 = 2;
		if(num1>num2) {
			return true;
		}else {
			return false;
		}
	}
	// type1 : �Ű����� x, ���ϰ� X
	public static void type4() {
		System.out.println("�ڵ� �׽�Ʈ�� �� �ϰ� �ͽ��ϴ�.");
	}
}
