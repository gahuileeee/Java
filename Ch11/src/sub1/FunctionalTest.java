package sub1;
/*
 * 날짜	: 2024-01-16
 * 이름	: 이가희
 * 내용	: 자바 함수형 프로그래밍 실습
 * 
 * 함수형 프로그래밍
 * - 프로그래밍 단위를 함수(method) 위주로 프로그래밍 하는 패러다임
 * - 함수형 프로그래밍을 람다식으로 구현
 */

interface A{
	public void hello();
}

class B implements A{
	@Override
	public void hello() {
		System.out.println("나는야 헬로");
	}
}
public class FunctionalTest {

		public static void main(String[] args) {
			// 객체 지향 프로그래밍
			A b = new B();
			b.hello();
			
			// 익명 객체 (인터페이스를 바로 객체로 생성)
			A a =new A() {
				@Override
				public void hello() {
				System.out.println("너는야 헬로");
				}
			};
			a.hello();
			
			// 함수형 프로그래밍 (반드시 타입은 interface type이어야 함)
			A a3 = () -> {System.out.println("우리는 헬로");};
			a3.hello();
		}
}
