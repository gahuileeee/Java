package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferIOTest {
	public static void main(String[] args) {
		String source  = "C:\\Users\\JAVA2\\Desktop\\Java.zip";
		String target = "C:\\Users\\JAVA2\\Desktop\\JavaCopy2.zip";
			try {
//				��Ʈ�� ���� (����)
				FileInputStream fis = new FileInputStream(source);
				FileOutputStream fos = new FileOutputStream(target);
				
//				���� ��Ʈ�� ����
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				
				while(true) {
					// ���� �б�
					 int data = bis.read();
					if(data==-1) {
						break;
					}
					bos.write(data);
				}
				bos.flush();
//				��Ʈ�� ����
				fis.close();
				fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("���α׷� ����.. ");
}
}
