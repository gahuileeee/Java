package sub3;

/*
 * 
 */
class Increment{
	private int num1;
	public static int num2;
	public Increment() {
		num1++;
		num2++;
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
	}
}
public class StaticTest {
	
	public static void main(String[]args) {
//		Car ��ü ����
		Car sonata = new Car("�ҳ�Ÿ", "���", 10);
		Car avante = new Car("�ƹ���", "����", 20);
		Car grande = new Car("�׷���", "����", 30);
		sonata.show();
//		��ü���� ��
		System.out.println("��ü ���� �� : " +Car.count);
		
//		Increment �ǽ�
		System.out.println();
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		Increment inc3 = new Increment();
//		���⼭ num2�� static���� ���� �����ϱ� ������ ++�� ��� �þ�µ�,
//		num1�� �� �����ڸ��� �����Ǵ� ��.
		
//		�̱��� ����
		System.out.println();
		/*Calc cal1 = new Calc();
		Calc cal2 = new Calc();
		Calc cal3 = new Calc(); 
		Calc cal4 = new Calc(); 
		System.out.println(cal1.plus(5, 4));
		System.out.println(cal2.minus(5, 4));
		System.out.println(cal3.multi(5, 4));
		System.out.println(cal4.div(5, 4));*/
//		�̷��� �ϸ� �޸� ���� �߻���. �̱����� ��������� ������ ���� ����.
		
		Calc cal1 = Calc.getInstance();
		Calc cal2 = Calc.getInstance();
//		�̷��� ��ü�� ����. �̷��� �ϸ� ���� ����� ����������
//		cal1 cal1, cal2 ��� ���� �����ڸ� ������.
		
	}
	
}
