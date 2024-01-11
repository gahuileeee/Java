package sub5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileTest {
	
	public static void main(String[] args) {
//		���� ��ü ����
		String path1 =  "C:\\Users\\JAVA2\\Desktop\\File1.txt";
		String path2 =  "C:\\Users\\JAVA2\\Desktop\\MyDir";
		//Ȯ���ڰ� ���� ���� Window������ folder�� �ǹ���
		
		File f1 = new File(path1);
		File f2 = new File(path2);
		
		try {
//			���� �Ǵ� ���丮 ����
			f1.createNewFile();
			f2.mkdir();
			
			//���� ����
			System.out.println("f1 exists : "+f1.exists());
			System.out.println("f1 isFile : "+f1.isFile());
			System.out.println("f1 isDrectory : "+f1.isDirectory());
			System.out.println("f2 exists : "+f2.exists());
			System.out.println("f2 isFile : "+f2.isFile());
			System.out.println("f2 isDrectory : "+f2.isDirectory());
			
			System.out.println("f1 getName : "+f1.getName());
			System.out.println("f2 getName : "+f2.getName());
			System.out.println("f1 getPath : "+f1.getPath());
			System.out.println("f2 getPath : "+f2.getPath());
			System.out.println("f1 getAbsolutePath : "+f1.getAbsolutePath());
			System.out.println("f2 getAbsolutePath : "+f2.getAbsolutePath());
			System.out.println();
			
//			���� ����
			f1.delete();
			f2.delete();
		} catch (IOException e) {
			e.printStackTrace();
		}
//		Files �� ��ü ���� ����. Files �ǽ� (path ��ü�� �־����)
		
		// Files �ǽ�(����ȭ�鿡 source.txt ���� ����� ������)
				Path source = Paths.get("C:\\Users\\java\\Desktop\\Source.txt");
				Path target = Paths.get("C:\\Users\\java\\Desktop\\Target.txt");
				Path destination = Paths.get("C:\\Users\\java\\Desktop\\MyDir\\Destination.txt");
				try {
					// ����
					Files.copy(source, target);
					// �̵�
					Files.move(source, destination, StandardCopyOption.REPLACE_EXISTING);
					// ����
					Files.delete(target);
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("���α׷� ����...");
		}
	}


