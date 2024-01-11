package sub4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
	
	public static void main(String[] args) {
		//������Ƽ ����(����ȭ)
		Properties prop = new Properties();
		prop.setProperty("A", "Apple");
		prop.setProperty("B", "Banana");
		prop.setProperty("C", "Cherry");
		System.out.println(prop);
		//�ݵ�� ����Ȯ���ڴ� properties�� �ؾ���
		String target = "C:\\Users\\JAVA2\\Desktop\\Fruit.properties";
//		���Ϸ� ��������
		try {
			FileOutputStream fos = new FileOutputStream(target);
			//����ȭ
			prop.store(fos, null);
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		///////////////////////////////////////////////////////////
		// ������Ƽ �б�(������ȭ)
		String source = "C:\\Users\\JAVA2\\Desktop\\City.properties";
		Properties propCity = new Properties();
		try {
			FileInputStream fis = new FileInputStream(source);
//			������ȭ
			propCity.load(fis);
			fis.close();
			System.out.println(propCity);
			System.out.print(propCity.getProperty("101")+" ");
			System.out.print(propCity.getProperty("104")+" ");
			System.out.print(propCity.getProperty("105")+" ");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("���α׷� ����");
	}
}
