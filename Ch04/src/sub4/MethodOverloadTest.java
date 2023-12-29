package sub4;

/*
 * ��¥: 2023-12-29
 * �̸�: �̰���
 * ����: �޼��� �����ε� �ǽ��ϱ�
 * 
 * �޼��� �����ε�(Overload)
 * - ���� �̸��� �޼��带 �Ű������� ������ �޼���
 * - �Ű����� ����, Ÿ������ ����
 * - ��ȯ Ÿ���� �ż��� �����ε� ���� �ȵ�
 */
public class MethodOverloadTest {

	public static void main(String[] args) {
		System.out.println(add(2));
		System.out.println(add(2,3));
		System.out.println(add(2.0,5.5));
		System.out.println(add('A','B'));
		System.out.println(add("�ڵ�","�׽�Ʈ"));
	}
	
//	Method Overloading
	public static int add(int a) {
		return a+a;
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static double add(double a, double b) {
		return a+b;
	}
	
	public static int add(char a, char b) {
		return a+b;
	}
	
	public static String add(String a, String b) {
//		���ڿ��� �����ִ� ��: concat�̶�� ��.
		return a+b;
	}
}
