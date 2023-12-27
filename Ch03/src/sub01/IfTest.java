package sub01;
/*
 *	날짜: 2023-12-27
 *	이름: 이가희
 * 	내용: Ch03. sub01. Java 조건문 if 실습
 */
public class IfTest {
	public static void main(String[] args) {
		
//		if
		int num1 = 1;
		int num2 = 2;
		
		if(/*조건식*/ num1 < num2) {
			System.out.println("num1은 num2보다 작다");
		}
		
		if(num1 >1) {
			System.out.println("num1은 1보다 크다");
		}
		
		if(num1 >0) {
			if(num2 >1 ) {
				System.out.println("num1은 0보다 크고 num2는 1보다 크다");
			}
		}
		// 위의 코드와 아래 코드는 논리적으로 같음.
		if(num1 >0 && num2 > 1) {
			System.out.println("num1은 0보다 크고 num2는 1보다 크다");
		}
		 System.out.println();
		 
		 
//		if~else
		 int var1 = 1 , var2 =2;
		if(var1 > var2) {
			System.out.println("var1이 var2보다 크다");
		}else {
			System.out.println("var1이 var2보다 작다");
		}
		
		System.out.println();
		
//		if~else if~else
		int n1 =1, n2 =2, n3 =3, n4 =4;
		if(n1 > n2) {
			System.out.println("n1이 n2보다 크다");
		}else if(n2 > n3){
			System.out.println("n2이 n3보다 크다");
		}else if(n3> n4){
			System.out.println("n3이 n4보다 크다");
		}else {
			System.out.println("n4가 가장 크다");
		}
		System.out.println();
	}

}
