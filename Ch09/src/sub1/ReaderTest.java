package sub1;

import java.io.FileReader;
import java.io.FileWriter;

public class ReaderTest {

			public static void main(String[] args) {
				
				String source  = "C:\\Users\\JAVA2\\Desktop\\Test1.txt";
				String target = "C:\\Users\\JAVA2\\Desktop\\Test2.txt";
					try {
//						��Ʈ�� ���� (����)
						FileReader fr= new FileReader(source);
						FileWriter fw = new FileWriter(target);
						while(true) {
							// ���� �б�
							 int data= fr.read();
							if(data==-1) {
								// ������ ��� �о��� �� �ݺ� ���� (���� ������ ������ -1�� return��)
								break;
							}
							char ch = (char) data; //�ƽ�Ű �ڵ�� ���� ���� �ٽ� ���ڷ� �ٲ�.
							System.out.print(ch);
							
//							���� ���� (���� �ش� ������ ���ٸ�, ������)
							fw.write(data);
							
						}
//						��Ʈ�� ����
						fr.close();
						fw.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println("���α׷� ����.. ");
	}
}
