package test1;

public class Test03 {
	/*
	 * ��¥ : 2023-12-28
	 * �̸� : �̰���
	 * ���� : �ڹ� ������ ��������
	 */
	public static void main(String[] args) {
		int num=1;
		int result;
		result = num++;
		System.out.println("result : "+result);
		
		result = ++num;
		System.out.println("result : "+ result);
		
		result = num--;
		System.out.println("result : "+ result);
		
		result = --num;
		System.out.println("result : "+ result);
	}

}
