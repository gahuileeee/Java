package sub3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializeTest {
	public static void main(String[] args) {
		String source = "C:\\Users\\JAVA2\\Desktop\\Apple.txt";
		
		try {
			// 객체를 직렬화하기 위한 스트림 생성
			FileInputStream fs = new FileInputStream(source);
			ObjectInputStream ois = new ObjectInputStream(fs);
//			객체 역직렬화
			Apple apple = (Apple)ois.readObject();
			apple.show();
			//스트림 해제
			ois.close();
			fs.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
