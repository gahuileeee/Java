package test1;

import java.util.Scanner;

public class Test06 {

/*
 * 	��¥ : 2023-12-28
 * 	�̸� : �̰���
 * 	���� : �ڹ� ���׿����� ��������
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x�� �Է� : ");
		int x =sc.nextInt();
		
		System.out.println("y�� �Է� : ");
		int y = sc.nextInt();
		
		String result = x > y ? "x�� �� Ů�ϴ�." : "y�� �� Ů�ϴ�.";
		
		System.out.println(result);
	}

}
