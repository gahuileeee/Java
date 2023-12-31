package sub03;
/*
 * 	날짜: 2023-12-27
 * 	이름: 이가희
 * 	내용: Ch03.sub03. For 문 실습
 */
public class ForTest {

	public static void main(String[] args) {
		
//		for
		for(/*초기식 ; 조건식 ; 증감식*/ 
			int i=1; i<=5 ; i++) {
			System.out.println("i : "+ i);
		}
		System.out.println();

//		1부터 10까지 합
		int sum = 0;
		for(int k=1; k<=10; k++) {
			sum+=k;
		}
		System.out.println("1부터 10까지 합 : "+ sum);
		System.out.println();
		
//		1부터 10까지 짝수합
		int tot = 0;
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				tot+=i;
			}
		}
		System.out.println("1부터 10까지의 짝수합 : "+ tot);
		System.out.println();
		
//		for 중첩
		for(int a=1; a<=3; a++) {
			System.out.println("a : "+a);
			for(int b=1 ; b<=5; b++) {
				System.out.print("b : "+ b);
			}
			System.out.println();
		}
		System.out.println();
		
//		구구단
		System.out.printf("%-7s%-6s%-7s%-6s%-7s%-7s%-7s%-7s","2단","3단","4단","5단","6단","7단","8단","9단");
		System.out.println();
		for(int i=1; i<=9; i++) {
			for(int k=2; k<=9; k++) {
				System.out.printf("%dx%d=%-2d ", k, i, k*i);
			}
			System.out.println();
		}
		System.out.println();
		
//		별삼각형
		for(int i=1; i<=10; i++) {
			for(int k=1; k<=i; k++) {
				System.out.print("★");
			}
				System.out.println();
		}
		System.out.println();
		
		for(int i=1; i<=10; i++) {
			for(int k=11-i; k>0; k--) {
				System.out.print("★");
			}
				System.out.println();
		}
		
	}
}
