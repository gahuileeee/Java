package sub2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * ��¥ : 2024-01-08
 * �̸� : �̰���
 * ���� : Java ���� ������ �ǽ�
 */
public class ThrowsTest {
	public static void main(String[] args) {
		while(true) {
			try {
				method1(10);
				break;
			}catch(ArithmeticException e) {
				e.printStackTrace();
				System.out.println("0 ���� �ٸ� �� �Է��ϼ���");
			}catch(InputMismatchException e) {
				System.out.println("���ڸ� �Է��ϼ���");
			}catch(Exception e) {
				
			}
			
		}

		System.out.println("���α׷� ���� ����..");
	}
	
	public static void method1(int n1) throws Exception {
		method2(n1);
	}
	
	public static void method2(int n2) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����Է� : " );
		int input = sc.nextInt();
		
		int result = n2/input;
		
		System.out.println("result : "+result);
	}
}
