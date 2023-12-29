package sub2;

public class MethodTest {
/*
 * 날짜 : 2023-12-29
 * 이름 : 이가희
 * 내용 : Method 실습
 */
	
	// main method : 자바 프로그램 시작 메서드
	public static void main(String[] args) {
		
		System.out.println(f(3));
		System.out.println(sum(1,10));
	} // main end
	
	
	// method 정의
	public static int f(int x) {
		int y = 2*x+3;
		return y;
	}
	
	public static int sum(int start, int end) {
		//지역 변수 start, end, total
		int total = 0;
		for(int k=start; k<=end; k++) {
			total+=k;
		}
		return total;
	}
	
	
}
