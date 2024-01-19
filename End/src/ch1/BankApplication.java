package ch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BankApplication {
	
	// accounts를 관리할 Account type의 List 생성
	private static List<Account> accounts = new ArrayList<>();
	
	// 입력받을 객체 생성
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		
		boolean run = true;
		
		// 반복문으로 명령 계속 수행하다, 5를 누르면 Application이 종료
		while (run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");
			// 선택값에 따라 생성
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
				//문자 (ex 1.계좌생성) 을 입력했을 때의 예외처리
				System.out.println("숫자만을 입력 해 주십시오");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("프로그램 종료");
	}

	// 계좌생성하기
	private static void createAccount() {
		boolean a= true;
		System.out.println("계좌생성");
		System.out.println("------------------------");

			try {
				System.out.print("계좌번호 : ");
				String anum = br.readLine();
				System.out.print("계좌주 : ");
				String aname = br.readLine();
				System.out.print("초기 입금액 : ");
				int balance = Integer.parseInt(br.readLine());
				accounts.add(new Account(anum, aname, balance));	
				System.out.println("결과 : 계좌가 생성되었습니다.");
			}catch(Exception e){
				System.out.println("잘못된 요청입니다.");
			}	
	
	}

	// 계좌목록보기
	private static void accountList() {
		System.out.println("계좌목록");
		System.out.println("------------------------");
		if(accounts.isEmpty()) {
			System.out.println("생성된 계좌가 없습니다");
		}else {
			for(Account account : accounts) {
				System.out.println(account);
				}
		}
		
	}

	// 예금하기
	private static void deposit() throws IOException  {
		System.out.println("예금");
		System.out.println("------------------------");
		System.out.print("계좌번호 : ");
		String anum=br.readLine();
		System.out.print("예금액 : ");
		int debalance = 0;
		try {
			debalance = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			System.out.println("숫자만 다시 입력해 주세요 : ");
			debalance = Integer.parseInt(br.readLine());
		}
		try {Account findAccount= findAccount(anum); 
			findAccount.setBalance(findAccount.getBalance()+debalance);
			System.out.println("예금이 성공되었습니다.");
		}
		catch(Exception e) {
		System.out.println("해당하는 계좌가 없습니다.");
		}
	}
	// 출금하기
	private static void withdraw() throws IOException {
		System.out.println("출금");
		System.out.println("------------------------");
		System.out.print("계좌번호 : ");
		String anum=br.readLine();
		System.out.print("출금액 : ");
		int debalance=0;
		try {
			debalance = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			System.out.println("숫자만 다시 입력해 주세요 : ");
			debalance = Integer.parseInt(br.readLine());
		}
		try {Account findAccount= findAccount(anum); 
			int temp = findAccount.getBalance()-debalance;
			if(temp<0) {
				System.out.println("출금액이 현재 잔액보다 많습니다.");
			}else {
				findAccount.setBalance(findAccount.getBalance()-debalance);
				System.out.println("출금이 성공되었습니다.");
			}
					}
		catch(Exception e) {
		System.out.println("해당하는 계좌가 없습니다.");
		}
	}

	// Account 리스트에서 anum와 동일한 Account 객체 찾기
	private static Account findAccount(String anum) {
		for(Account account : accounts) {
			if(account.getAnum().equals(anum)) {
				return account;
			}
		}
		return null;
	}
}


