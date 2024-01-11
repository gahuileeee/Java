package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOTest {

		public static void main(String[] args) {
			
			String source  = "C:\\Users\\JAVA2\\Desktop\\Test1.txt";
			String target = "C:\\Users\\JAVA2\\Desktop\\Test2.txt";
			

				try {
//					��Ʈ�� ���� (����)
					FileInputStream fis;
					fis = new FileInputStream(source);
					FileOutputStream fos = new FileOutputStream(target);
					while(true) {
						// ���� �б�
						 int data = fis.read();
						if(data==-1) {
							// ������ ��� �о��� �� �ݺ� ���� (���� ������ ������ -1�� return��)
							break;
						}
						char ch = (char) data; //�ƽ�Ű �ڵ�� ���� ���� �ٽ� ���ڷ� �ٲ�.
//						System.out.print(ch);
						
//						���� ���� (���� �ش� ������ ���ٸ�, ������)
						fos.write(data);
						
					}
//					��Ʈ�� ����
					fis.close();
					fos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				System.out.println("���α׷� ����.. ");
				
}
}
