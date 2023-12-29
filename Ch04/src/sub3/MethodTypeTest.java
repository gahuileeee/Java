package sub3;
/*
 *  날짜: 2023-12-29
 *  이름: 이가희
 *  내용: 메서드 형태 실습
 */
public class MethodTypeTest {

	public static void main(String[] args) {
		
		System.out.println("반지름이 5.0cm인 원의 넓이 : "+type1(5.0)+"cm2");
		System.out.print("0은 1보다 크다는 말은 "); type2(0>1);
		if(type3()) System.out.println("num1은 num2보다 큽니다.");
		else System.out.println("num1은 num2보다 작습니다.");
		type4();
	}
	
	// type1 : 매개변수 O, 리턴값 O
	public static double type1(double x) {
		return (x*x) * 3.1415926535;
	}
	
	// type1 : 매개변수 O, 리턴값 X
	public static void type2(boolean status) {
		if(status) {
			System.out.println("참 입니다.");
		}else {
			System.out.println("거짓입니다");
		}
	}
	// type1 : 매개변수 X, 리턴값 O
	public static boolean type3() {
		int num1 = 1;
		int num2 = 2;
		if(num1>num2) {
			return true;
		}else {
			return false;
		}
	}
	// type1 : 매개변수 x, 리턴값 X
	public static void type4() {
		System.out.println("코딩 테스트를 잘 하고 싶습니다.");
	}
}
