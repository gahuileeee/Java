package sub5;

public class MathTest {

	public static void main(String[] args) {
//		Math math = new Math(); ������ ������ �� ����.
//		�̱��浵 ����.
//		-> Math�� ��ü������ �ȵ�.
		
//		�⺻ �޼���
		System.out.println("���밪 : "+Math.abs(-5));
		System.out.println("������ : "+Math.sqrt(9));
		System.out.println("�ø��� : "+Math.ceil(1.2));
		System.out.println("�ø��� : "+Math.ceil(1.8));
		System.out.println("������ : "+Math.floor(1.2));
		System.out.println("������ : "+Math.floor(1.8));
		System.out.println("�ݿø� : "+Math.round(1.2));
		System.out.println("�ݿø� : "+Math.round(1.8));
		
//		���� �޼ҵ�
		double num1 =Math.random(); //0~1 ���� �Ǽ�
		System.out.println("num1 : "+num1);
		
		double num2 = num1*10; // 0~10 ���� �Ǽ�
		System.out.println("num2 : "+num2);
		
		double num3 = Math.ceil(num2); 
		int num4 = (int)num3; //1~10���� ����
		System.out.println("num3 : "+num4);
		
		
//		1~45 ���� ������ ����
		System.out.println((int)Math.ceil(Math.random()*45 ));
	}
}
