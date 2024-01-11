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
//				스트림 생성 (연결)
				FileInputStream fis = new FileInputStream(source);
				FileOutputStream fos = new FileOutputStream(target);
				
//				보조 스트림 생성
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				
				while(true) {
					// 파일 읽기
					 int data = bis.read();
					if(data==-1) {
						break;
					}
					bos.write(data);
				}
				bos.flush();
//				스트림 해제
				fis.close();
				fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("프로그램 종료.. ");
}
}
