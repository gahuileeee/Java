package sub1;
/*
 * 날짜 : 2024-01-09
 * 이름 : 이가희
 * 내용 : Object class 실습
 */
public class ObjectTest {

	public static void main(String[] args) {
		
		Object a1 = new Apple("한국",3000);
		Object a2 = new Apple("일본",2000);
		
		a1.toString();
		a2.toString();
		
//		객체 비교
		
//		 a1과 a2가 할당받은 주소를 비교.(stack의 값을 비교)
		if(a1 == a2) {
			System.out.println("a1, a2 주소가 같다.");
		}else {
			System.out.println("a1, a2 주소가 다르다.");
		}
		
//		a1이 가르키는 instance와 a2가 가르키는 instance(heap의 값)를 비교.
		if(a1.equals(a2)) {
			System.out.println("a1, a2가 같다.");
		}else {
			System.out.println("a1, a2가 다르다.");
		}
	}
}
