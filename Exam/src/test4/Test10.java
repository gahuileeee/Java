package test4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ��¥ : 2024-01-12
 * �̸� : �̰���
 * ���� : �ڹ� ���� ����� ��������
 */
public class Test10 {

	public static void main(String[] args) {
		String path = "C:\\Users\\JAVA2\\Desktop\\Gugudan.txt";
		
		try {
			File file = new File(path);
			FileWriter fw = new FileWriter(file);
			
			for(int x=2; x<=9; x++) {
				fw.write(x+"��\n");
				for(int y=1; y<=9; y++) {
					int z= x*y;
					fw.write(x+" X "+y+" = "+z+"\n");
				}
					
			}
			fw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("������ ���ϻ��� �Ϸ�...");
	}
}
