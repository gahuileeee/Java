package sub3;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeTest {

		public static void main(String[] args) {
			
			Apple apple = new Apple("�ѱ�",3000);
			
			String target = "C:\\Users\\JAVA2\\Desktop\\Apple.txt";
			
			try {
				// ��ü�� ����ȭ�ϱ� ���� ��Ʈ�� ����
				FileOutputStream fos = new FileOutputStream(target);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
//				��ü ����ȭ
				oos.writeObject(apple);
				
				//��Ʈ�� ����
				oos.close();
				fos.close();
			}catch(Exception e) {
				System.out.println("����");
			}
			System.out.println("�Ǿ���");
		}
		
}
