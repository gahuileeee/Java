package test4;

import java.util.Scanner;

/*
 * ��¥ : 2024-01-12
 * �̸� : �̰���
 * ���� :	 �ڹ� ����ó�� ��������
 */

class LoginException extends Exception{
	public LoginException(String msg) {
		super(msg);
	}
}
public class Test03 {
	public static void main(String[] args) {
		String userId = "a101";
		String userPw = "abc1234";	
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("���̵� : ");
			String inputId = sc.nextLine();
			System.out.print("��й�ȣ : ");
			String inputPw = sc.nextLine();
			if(!userId.equals(inputId)) {
				throw new LoginException("���̵� �ùٸ��� �ʽ��ϴ�.");
			}else if(!userPw.equals(inputPw)) {
				throw new LoginException("��й�ȣ�� �ùٸ��� �ʽ��ϴ�.");
			}else {
				System.out.println("�α��� ����!");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
