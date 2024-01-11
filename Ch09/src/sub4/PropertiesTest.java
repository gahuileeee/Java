package sub4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
	
	public static void main(String[] args) {
		//프로퍼티 저장(직렬화)
		Properties prop = new Properties();
		prop.setProperty("A", "Apple");
		prop.setProperty("B", "Banana");
		prop.setProperty("C", "Cherry");
		System.out.println(prop);
		//반드시 파일확장자는 properties로 해야함
		String target = "C:\\Users\\JAVA2\\Desktop\\Fruit.properties";
//		파일로 내보내기
		try {
			FileOutputStream fos = new FileOutputStream(target);
			//직렬화
			prop.store(fos, null);
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		///////////////////////////////////////////////////////////
		// 프로퍼티 읽기(역직렬화)
		String source = "C:\\Users\\JAVA2\\Desktop\\City.properties";
		Properties propCity = new Properties();
		try {
			FileInputStream fis = new FileInputStream(source);
//			역직렬화
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
		System.out.println("프로그램 종료");
	}
}
