package test2;
/* 
 * ��¥: 2023-12-29
 * �̸�: �̰���
 * ���� : �ڹ� �迭 �ִ밪 ã�� ��������
 */
public class Test02 {

	public static void main(String[] args) {
		int arr[] = {17, 92, 18, 33, 58, 7, 26 , 42	};
		
		int maxNum = arr[0];
		for(int i=0; i<8; i++) {
			if(maxNum < arr[i]) {
				maxNum=arr[i];
			}
		}
		System.out.println("�迭 arr���� ���� ū �� : "+maxNum);
	}

}