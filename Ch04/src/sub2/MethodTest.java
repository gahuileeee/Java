package sub2;

public class MethodTest {
/*
 * ��¥ : 2023-12-29
 * �̸� : �̰���
 * ���� : Method �ǽ�
 */
	
	// main method : �ڹ� ���α׷� ���� �޼���
	public static void main(String[] args) {
		
		System.out.println(f(3));
		System.out.println(sum(1,10));
	} // main end
	
	
	// method ����
	public static int f(int x) {
		int y = 2*x+3;
		return y;
	}
	
	public static int sum(int start, int end) {
		//���� ���� start, end, total
		int total = 0;
		for(int k=start; k<=end; k++) {
			total+=k;
		}
		return total;
	}
	
	
}
