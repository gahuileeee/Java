package sub3;

public class Calc {
	
//	싱글톤 객체 생성--------------------
//	해당 클래스 내에서 정적으로 객체를 생성하는 꼴
	private static Calc instance = new Calc();
	
	public static Calc getInstance() {
		return instance;
	}
	private  Calc() {}
	
//	이렇게 까지가 싱글톤 set--------------
	
	public int plus(int x, int y) {
		return x+y;
	}
	public int minus(int x, int y) {
		return x-y;
	}
	public int multi(int x, int y) {
		return x*y;
	}
	public int div(int x, int y) {
		return x/y;
	}
	
	public static void main(String[]args) {
		 
	}
}
