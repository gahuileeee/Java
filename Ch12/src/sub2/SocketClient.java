package sub2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class SocketClient {
	public static void main(String[] args) {
		System.out.println("[Client]");
		
		Socket socket = null;
		
	
		try {
			socket = new Socket();
			System.out.println("���� ��û...");
			socket.connect(new InetSocketAddress("127.0.0.1", 50001));
			// clinet�� ip �ּҿ� ���� �� port ��ȣ ���� ���⼭ 127.0.0.1�� Loopback���� ��û�� Server���� ������ �ٽ� �ڱ⿡�Է� ��û�� ���ư�.
			// ���� �ڱ� �ڽ��� Client���� Server�� �� =localhost
			System.out.println("���� ����...");
			
			// ������ �۽� (Client -> Server)
			OutputStream os = socket.getOutputStream();
			String msg = "Hello Server!";
			byte [] msgBytes = msg.getBytes();
			os.write(msgBytes);
			os.flush();
			
			System.out.println("������ �۽� �Ϸ�...");
			
			//������ ���� (Server-> Client )
			InputStream is = socket.getInputStream();
			byte[] bytes = new byte [100];
			int readBytes = is.read(bytes);
			String result = new String(bytes, 0, readBytes, "UTF-8");
			System.out.println(result);
			
			System.out.println("������ ���� �Ϸ�...");
			
			os.close();
			is.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		//Socket ����
		if(!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("client ����...");
	}
}
