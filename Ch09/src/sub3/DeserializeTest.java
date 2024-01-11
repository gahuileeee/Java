package sub3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializeTest {
	public static void main(String[] args) {
		String source = "C:\\Users\\JAVA2\\Desktop\\Apple.txt";
		
		try {
			// ��ü�� ����ȭ�ϱ� ���� ��Ʈ�� ����
			FileInputStream fs = new FileInputStream(source);
			ObjectInputStream ois = new ObjectInputStream(fs);
//			��ü ������ȭ
			Apple apple = (Apple)ois.readObject();
			apple.show();
			//��Ʈ�� ����
			ois.close();
			fs.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
