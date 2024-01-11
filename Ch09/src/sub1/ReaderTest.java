package sub1;

import java.io.FileReader;
import java.io.FileWriter;

public class ReaderTest {

			public static void main(String[] args) {
				
				String source  = "C:\\Users\\JAVA2\\Desktop\\Test1.txt";
				String target = "C:\\Users\\JAVA2\\Desktop\\Test2.txt";
					try {
//						스트림 생성 (연결)
						FileReader fr= new FileReader(source);
						FileWriter fw = new FileWriter(target);
						while(true) {
							// 파일 읽기
							 int data= fr.read();
							if(data==-1) {
								// 파일을 모두 읽었을 때 반복 종료 (읽을 파일이 없으면 -1을 return함)
								break;
							}
							char ch = (char) data; //아스키 코드로 읽은 것을 다시 문자로 바꿈.
							System.out.print(ch);
							
//							파일 쓰기 (만약 해당 파일이 없다면, 생성함)
							fw.write(data);
							
						}
//						스트림 해제
						fr.close();
						fw.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println("프로그램 종료.. ");
	}
}
