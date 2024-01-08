package sub1;
/*
 * 날짜: 2024-01-08
 * 이름: 이가희
 * 내용: Java 예외처리 실습
 */
public class ExceptionTest {

		public static void main(String[] args) {
			// 일반 예외 (컴파일 타임)
			
			// 실행 예외 (런타임)
			
//			예외상황1. 어떤 수를 0으로 나눌 때
			int num1 = 1;
			int num2 = 0;
			
			int r1= 0;
			int r2= 0;
			int r3= 0;
			int r4= 0;
			
			try {
//				예외가 발생할 수 있는 코드
				 r1= num1+num2;
				 r2= num1-num2;
				 r3= num1*num2;
				 r4= num1/num2;
				
				System.out.println("r1 : "+r1);
				System.out.println("r2 : "+r2);
				System.out.println("r3 : "+r3);
				System.out.println("r4 : "+r4);
			}catch (ArithmeticException e) {
//				예외가 발생했을 때
				e.printStackTrace();
				System.out.println("r1 : "+r1);
				System.out.println("r2 : "+r2);
				System.out.println("r3 : "+r3);
				System.out.println("0으로는 나눌 수 없습니다");
				
			}
//			예외상황2. 배열의 인덱스번호가 없을 때
			int [] arr= {1,2,3,4,5};
			try {
				for(int i=0; i<6; i++) {
					System.out.print(arr[i]+" ");
				}
			}catch(ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				System.out.println();
				System.out.println("인덱스 범위를 초과했습니다.");
			}
//			예외상황3. 객체 생성없이 메소드 호출
			try {
				Animal a = null; //객체를 생성한 것이 아니라 참조 변수를 만든 것.
				a.move();
				
			}catch(NullPointerException e) {
				e.printStackTrace();
				System.out.println("객체를 생성하세요");
			}
//			예외상황4. 잘못된 캐스팅
			Animal a1 = new Tiger();
			Animal a2 = new Eagle();
			Animal a3 = new Shark();
			try {
				Tiger tiger = (Tiger) a1; //다운캐스팅
				Shark shark = (Shark) a2; //잘못된 다운 캐스팅
				
				tiger.move();
				tiger.hunt();
				
				shark.move();
				shark.hunt();
			}catch(ClassCastException e) {
				e.printStackTrace();
			}
			
//			일반 예외 (컴파일 타임)
			
			try {
				Class animal = Class.forName("sub1.Lion");
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}finally {
//				예외 처리 발생여부에 상관없이 항상 실행되는 코드
				System.gc(); //메모리 정리 (힙 영역안에 있는 것들을 정리)
			}
		}
}
