package sub2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 날짜 : 2024-01-08
 * 이름 : 이가희
 * 내용 : Java 예외 던지기 실습
 */
public class ThrowsTest {
	public static void main(String[] args) {
		while(true) {
			try {
				method1(10);
				break;
			}catch(ArithmeticException e) {
				e.printStackTrace();
				System.out.println("0 말고 다른 걸 입력하세요");
			}catch(InputMismatchException e) {
				System.out.println("숫자를 입력하세요");
			}catch(Exception e) {
				
			}
			
		}

		System.out.println("프로그램 정상 종료..");
	}
	
	public static void method1(int n1) throws Exception {
		method2(n1);
	}
	
	public static void method2(int n2) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자입력 : " );
		int input = sc.nextInt();
		
		int result = n2/input;
		
		System.out.println("result : "+result);
	}
}
