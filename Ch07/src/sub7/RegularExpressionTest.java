package sub7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionTest {
	
	public static void main(String[] args) {
		
		String pattern = "a[a-z]*";
		
		boolean r1 = Pattern.matches(pattern, "apple");
		boolean r2 = Pattern.matches(pattern, "banana");
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		
		// ����ǥ���� ����
		String[] patterns = {
			"[0-9]+",  	// ���� 1�� �̻�
			"1[0-9]*", 	// 1�� �����ϴ� ���� 0�� �̻�
			"^[0-9]",  	// ���ڷ� �����ϴ� ����
			"[^0-9]",  	// ���ڰ� �ƴ� ����
			".",	   	// ���� 1��
			"[a-z]?",	// ���� �ҹ��� 1��
			"[a-z]*",	// ���� �ҹ��� 0�� �̻�
			"[a-z]+",	// ���� �ҹ��� 1�� �̻�
			"[A-Z]*",	// ���� �빮�� 0�� �̻�
			"[��-�R]+",	// �ѱ� 1�� �̻�
			"^[0-9a-z]*",   // ����+���� ���� 0�� �̻�								
			"^[0-9��-�R]*",  // ����+�ѱ� ���� 0�� �̻�
			"^[A-Z][a-z]*", // ���� �빮�ڷ� �����ϴ� ���� 0�� �̻� 
			"\\s",		// ����
			"\\S",		// ������        �ƴ� ����
			"\\d",		// ����
			"\\w",		// ���ڿ� ����
			"\\W",		// Ư������
		};
		
		String[] words = {"apple", "123abc", "123456", "011�ѱ�", "hello", "ȫ�浿", "1", "Banana", "APPLE", "#"};
		
		for(String word : words) {
			
			System.out.print(word + " ���ڿ� ��ġ�ϴ� ���� : ");
			
			for(String ptt : patterns) {
				
				boolean result = Pattern.matches(ptt, word);
				
				if(result) {
					System.out.print(ptt + ", ");
				}
				
			}
			System.out.print("\n");
		}
		// ���� ����ϴ� ����ǥ����
				String input = "a101,ȫ�浿,010-1234-1001,hong@gmail.com";

		        // ���� ����
		        String ptt1 = "^[a-z][a-z0-9]{3,10}$"; // ���� �ҹ��� 1�ڷ� �����ϰ� �ҹ���, ���� 3�ڸ� �̻� 10�ڸ� �̸�
		        String ptt2 = "^[��-�R]*$";
		        String ptt3 = "(01\\d{1})-(\\d{3,4})-(\\d{4})";
				String ptt4 = "(\\w+)@(\\w+).(\\w+)";

		        // ���� ������
		        Pattern p1 = Pattern.compile(ptt1);
		        Pattern p2 = Pattern.compile(ptt2);
		        Pattern p3 = Pattern.compile(ptt3);
		        Pattern p4 = Pattern.compile(ptt4);

		        // Matcher ����
		        Matcher m1 = p1.matcher(input.split(",")[0]);
		        Matcher m2 = p2.matcher(input.split(",")[1]);
		        Matcher m3 = p3.matcher(input.split(",")[2]);
		        Matcher m4 = p4.matcher(input.split(",")[3]);

		        // ���̵� ã��
		        System.out.print("���̵� : ");
		        while (m1.find()) {
		            System.out.println(m1.group());
		        }

		        // �̸� ã��
		        System.out.print("�̸� : ");
		        while (m2.find()) {
		            System.out.println(m2.group());
		        }
		        
		        // �޴��� ã��
		        System.out.print("�޴��� : ");
		        while (m3.find()) {
		            System.out.println(m3.group());
		        }
		        
		        // �̸��� ã��
		        System.out.print("�̸��� : ");
		        while (m4.find()) {
		            System.out.println(m4.group());
		        }
		
	}
}