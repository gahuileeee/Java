package sub4;

/*
 * 날짜: 2023-12-29
 * 이름: 이가희
 * 내용: 메서드 오버로드 실습하기
 * 
 * 메서드 오버로드(Overload)
 * - 같은 이름의 메서드를 매개변수로 구분한 메서드
 * - 매개변수 갯수, 타입으로 구분
 * - 반환 타입은 매서드 오버로드 지원 안됨
 */
public class MethodOverloadTest {

	public static void main(String[] args) {
		System.out.println(add(2));
		System.out.println(add(2,3));
		System.out.println(add(2.0,5.5));
		System.out.println(add('A','B'));
		System.out.println(add("코딩","테스트"));
	}
	
//	Method Overloading
	public static int add(int a) {
		return a+a;
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static double add(double a, double b) {
		return a+b;
	}
	
	public static int add(char a, char b) {
		return a+b;
	}
	
	public static String add(String a, String b) {
//		문자열을 더해주는 것: concat이라고 함.
		return a+b;
	}
}
