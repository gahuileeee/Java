package test1;

import java.util.Scanner;

public class Test05 {

/*
 * 	��¥ : 2023-12-28
 * 	�̸� : �̰���
 * 	���� : �ڹ� ���ǹ� ��������
 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int score = sc.nextInt();
		
		System.out.println("�Է��� ������ "+score+"�Դϴ�.");
		
		int a =score%10;
		score -=a;
		score /=10;
		switch(score) {
		case 10:
		case 9: 
			System.out.println("A �Դϴ�");
			break;
		case 8: 
			System.out.println("B �Դϴ�");
			break;
		case 7: 
			System.out.println("C �Դϴ�");
			break;
		case 6: 
			System.out.println("A �Դϴ�");
			break;
		default: 
			System.out.println("A �Դϴ�");
			break;
		}
		
		sc.close();
	}

}
