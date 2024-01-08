package sub1;
/*
 * ��¥: 2024-01-08
 * �̸�: �̰���
 * ����: Java ����ó�� �ǽ�
 */
public class ExceptionTest {

		public static void main(String[] args) {
			// �Ϲ� ���� (������ Ÿ��)
			
			// ���� ���� (��Ÿ��)
			
//			���ܻ�Ȳ1. � ���� 0���� ���� ��
			int num1 = 1;
			int num2 = 0;
			
			int r1= 0;
			int r2= 0;
			int r3= 0;
			int r4= 0;
			
			try {
//				���ܰ� �߻��� �� �ִ� �ڵ�
				 r1= num1+num2;
				 r2= num1-num2;
				 r3= num1*num2;
				 r4= num1/num2;
				
				System.out.println("r1 : "+r1);
				System.out.println("r2 : "+r2);
				System.out.println("r3 : "+r3);
				System.out.println("r4 : "+r4);
			}catch (ArithmeticException e) {
//				���ܰ� �߻����� ��
				e.printStackTrace();
				System.out.println("r1 : "+r1);
				System.out.println("r2 : "+r2);
				System.out.println("r3 : "+r3);
				System.out.println("0���δ� ���� �� �����ϴ�");
				
			}
//			���ܻ�Ȳ2. �迭�� �ε�����ȣ�� ���� ��
			int [] arr= {1,2,3,4,5};
			try {
				for(int i=0; i<6; i++) {
					System.out.print(arr[i]+" ");
				}
			}catch(ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				System.out.println();
				System.out.println("�ε��� ������ �ʰ��߽��ϴ�.");
			}
//			���ܻ�Ȳ3. ��ü �������� �޼ҵ� ȣ��
			try {
				Animal a = null; //��ü�� ������ ���� �ƴ϶� ���� ������ ���� ��.
				a.move();
				
			}catch(NullPointerException e) {
				e.printStackTrace();
				System.out.println("��ü�� �����ϼ���");
			}
//			���ܻ�Ȳ4. �߸��� ĳ����
			Animal a1 = new Tiger();
			Animal a2 = new Eagle();
			Animal a3 = new Shark();
			try {
				Tiger tiger = (Tiger) a1; //�ٿ�ĳ����
				Shark shark = (Shark) a2; //�߸��� �ٿ� ĳ����
				
				tiger.move();
				tiger.hunt();
				
				shark.move();
				shark.hunt();
			}catch(ClassCastException e) {
				e.printStackTrace();
			}
			
//			�Ϲ� ���� (������ Ÿ��)
			
			try {
				Class animal = Class.forName("sub1.Lion");
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}finally {
//				���� ó�� �߻����ο� ������� �׻� ����Ǵ� �ڵ�
				System.gc(); //�޸� ���� (�� �����ȿ� �ִ� �͵��� ����)
			}
		}
}
