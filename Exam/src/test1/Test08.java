package test1;

public class Test08 {
	/*
	 * 	��¥ : 2023-12-28
	 * 	�̸� : �̰���
	 * 	���� : �ڹ� �ݺ��� ��������
	 */
	public static void main(String[] args) {
		int n = 5;
//		4 3 2 1 0
		for(int i=0; i<n; i++) {
			for( int j=n-1 ; j>i; j--) {
				System.out.print(" ");
			}
			for( int j=0 ; j<=2*(i+1)-2 ; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
