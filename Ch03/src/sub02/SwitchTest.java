package sub02;

import java.util.Scanner;

/*
 * 	날짜: 2023-12-27
 * 	이름: 이가희
 * 	내용: Ch03. sub02. Java Switch문 실습
 */
public class SwitchTest {

	public static void main(String[] args) {
		
		System.out.print("숫자 입력 : ");
		
		//사용자 입력
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		System.out.println("입력한 숫자 : "+ number);
		
		switch(/*조건값*/ number % 2) {
		case 0 :
			System.out.println("number는 짝수 입니다.");
			break;
		case 1:
			System.out.println("number는 홀수 입니다.");
			break;
		
		}
	}

}
