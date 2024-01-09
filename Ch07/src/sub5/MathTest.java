package sub5;

public class MathTest {

	public static void main(String[] args) {
//		Math math = new Math(); 생성자 생성할 수 없음.
//		싱글톤도 없음.
//		-> Math는 객체생성이 안됨.
		
//		기본 메서드
		System.out.println("절대값 : "+Math.abs(-5));
		System.out.println("제곱근 : "+Math.sqrt(9));
		System.out.println("올림값 : "+Math.ceil(1.2));
		System.out.println("올림값 : "+Math.ceil(1.8));
		System.out.println("내림값 : "+Math.floor(1.2));
		System.out.println("내림값 : "+Math.floor(1.8));
		System.out.println("반올림 : "+Math.round(1.2));
		System.out.println("반올림 : "+Math.round(1.8));
		
//		랜덤 메소드
		double num1 =Math.random(); //0~1 사이 실수
		System.out.println("num1 : "+num1);
		
		double num2 = num1*10; // 0~10 사이 실수
		System.out.println("num2 : "+num2);
		
		double num3 = Math.ceil(num2); 
		int num4 = (int)num3; //1~10사이 정수
		System.out.println("num3 : "+num4);
		
		
//		1~45 사이 임의의 정수
		System.out.println((int)Math.ceil(Math.random()*45 ));
	}
}
