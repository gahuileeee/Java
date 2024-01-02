package sub3;

/*
 * 
 */
class Increment{
	private int num1;
	public static int num2;
	public Increment() {
		num1++;
		num2++;
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
	}
}
public class StaticTest {
	
	public static void main(String[]args) {
//		Car 객체 생성
		Car sonata = new Car("소나타", "흰색", 10);
		Car avante = new Car("아반태", "검정", 20);
		Car grande = new Car("그랜져", "남색", 30);
		sonata.show();
//		전체차량 수
		System.out.println("전체 차량 수 : " +Car.count);
		
//		Increment 실습
		System.out.println();
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		Increment inc3 = new Increment();
//		여기서 num2는 static으로 서로 공유하기 때문에 ++가 계속 늘어나는데,
//		num1는 각 생성자마다 생성되는 것.
		
//		싱글톤 예제
		System.out.println();
		/*Calc cal1 = new Calc();
		Calc cal2 = new Calc();
		Calc cal3 = new Calc(); 
		Calc cal4 = new Calc(); 
		System.out.println(cal1.plus(5, 4));
		System.out.println(cal2.minus(5, 4));
		System.out.println(cal3.multi(5, 4));
		System.out.println(cal4.div(5, 4));*/
//		이렇게 하면 메모리 낭비가 발생함. 싱글톤을 만들었더니 생성자 생성 못함.
		
		Calc cal1 = Calc.getInstance();
		Calc cal2 = Calc.getInstance();
//		이렇게 객체를 얻어옴. 이렇게 하면 위와 결과는 동일하지만
//		cal1 cal1, cal2 모두 같은 생성자를 참조함.
		
	}
	
}
