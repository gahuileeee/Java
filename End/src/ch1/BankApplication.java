package ch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BankApplication {
	
	// accounts�� ������ Account type�� List ����
	private static List<Account> accounts = new ArrayList<>();
	
	// �Է¹��� ��ü ����
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		
		boolean run = true;
		
		// �ݺ������� ��� ��� �����ϴ�, 5�� ������ Application�� ����
		while (run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("----------------------------------------------------------");
			System.out.print("����> ");
			// ���ð��� ���� ����
			try {
				int select = Integer.parseInt(br.readLine());
				switch(select) {
				case 1 : 	createAccount(); break;
					
				case 2 :	accountList() ; break;
				
				case 3 :	deposit(); break;
					
				case 4 :	withdraw(); break;
					
				case 5 :	 run=false;
				}	
			}catch(NumberFormatException e) {
				//���� (ex 1.���»���) �� �Է����� ���� ����ó��
				System.out.println("���ڸ��� �Է� �� �ֽʽÿ�");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("���α׷� ����");
	}

	// ���»����ϱ�
	private static void createAccount() {
		boolean a= true;
		System.out.println("���»���");
		System.out.println("------------------------");

			try {
				System.out.print("���¹�ȣ : ");
				String anum = br.readLine();
				System.out.print("������ : ");
				String aname = br.readLine();
				System.out.print("�ʱ� �Աݾ� : ");
				int balance = Integer.parseInt(br.readLine());
				accounts.add(new Account(anum, aname, balance));	
				System.out.println("��� : ���°� �����Ǿ����ϴ�.");
			}catch(Exception e){
				System.out.println("�߸��� ��û�Դϴ�.");
			}	
	
	}

	// ���¸�Ϻ���
	private static void accountList() {
		System.out.println("���¸��");
		System.out.println("------------------------");
		if(accounts.isEmpty()) {
			System.out.println("������ ���°� �����ϴ�");
		}else {
			for(Account account : accounts) {
				System.out.println(account);
				}
		}
		
	}

	// �����ϱ�
	private static void deposit() throws IOException  {
		System.out.println("����");
		System.out.println("------------------------");
		System.out.print("���¹�ȣ : ");
		String anum=br.readLine();
		System.out.print("���ݾ� : ");
		int debalance = 0;
		try {
			debalance = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			System.out.println("���ڸ� �ٽ� �Է��� �ּ��� : ");
			debalance = Integer.parseInt(br.readLine());
		}
		try {Account findAccount= findAccount(anum); 
			findAccount.setBalance(findAccount.getBalance()+debalance);
			System.out.println("������ �����Ǿ����ϴ�.");
		}
		catch(Exception e) {
		System.out.println("�ش��ϴ� ���°� �����ϴ�.");
		}
	}
	// ����ϱ�
	private static void withdraw() throws IOException {
		System.out.println("���");
		System.out.println("------------------------");
		System.out.print("���¹�ȣ : ");
		String anum=br.readLine();
		System.out.print("��ݾ� : ");
		int debalance=0;
		try {
			debalance = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			System.out.println("���ڸ� �ٽ� �Է��� �ּ��� : ");
			debalance = Integer.parseInt(br.readLine());
		}
		try {Account findAccount= findAccount(anum); 
			int temp = findAccount.getBalance()-debalance;
			if(temp<0) {
				System.out.println("��ݾ��� ���� �ܾ׺��� �����ϴ�.");
			}else {
				findAccount.setBalance(findAccount.getBalance()-debalance);
				System.out.println("����� �����Ǿ����ϴ�.");
			}
					}
		catch(Exception e) {
		System.out.println("�ش��ϴ� ���°� �����ϴ�.");
		}
	}

	// Account ����Ʈ���� anum�� ������ Account ��ü ã��
	private static Account findAccount(String anum) {
		for(Account account : accounts) {
			if(account.getAnum().equals(anum)) {
				return account;
			}
		}
		return null;
	}
}


