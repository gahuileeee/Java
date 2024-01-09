package sub2;
/*
 * ��¥ : 2024-01-09
 * �̸� : �̰���
 * ���� : String class �ǽ�
 */
public class StringTest {

	public static void main(String[] args) {
//		���ڿ� ����
		String str1= "Hello"; //���ͷ�(�Ͻ���)
		String str2= new String("Hello"); //�����
		
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		
//		���ڿ� �� <�̰ɷ� �ض�
		if(str1 == str2) {
			System.out.println("str1, str2 ���ڿ��� ����.");
		}else {
			System.out.println("str1, str2 ���ڿ��� �ٸ���.");
		}
		
		if(str1.equals(str2)) {
			System.out.println("str1, str2 ���ڿ��� ����.");
		}else {
			System.out.println("str1, str2 ���ڿ��� �ٸ���.");
		}
		
//		���ڿ� ����
		String msg = "Hello Korea";
		System.out.println("msg ���� : "+msg.length());
		
//		���� ����
		char c1 = msg.charAt(0);
		char c2 = msg.charAt(6);
		System.out.println("msg 1��° ���� : "+c1);
		System.out.println("msg 7��° ���� : "+c2);

//		���ڿ� �ڸ���
		String sub1 =msg.substring(0,5);
		String sub2 =msg.substring(6); //6��°���� ���������� �ڸ��� ��
		System.out.println("sub1 : "+sub1);
		System.out.println("sub2 : "+sub2);
		
//		���ڿ� �ε���
		int idx1= msg.indexOf("e"); //�տ������� ã��
		int idx2= msg.lastIndexOf("e"); //�ڿ������� ã��
		System.out.println("idx1 : "+idx1);
		System.out.println("idx2 : "+idx2);
		
//		���ڿ� ��ü
		String r1 = msg.replace("Korea","Busan");
		String r2 = msg.replace("Hello","Welcome");
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		
//		���ڿ� ��ȯ
		int var1 =1;
		double var2 = 3.14;
		boolean var3= true;
		
		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);
		String s3 = ""+var3; //�̷������ε� ���� ��. concat����� ��.

		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
		
	}
}
