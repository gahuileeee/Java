package sub2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
	public static void main(String[] args) {
		System.out.println("[Server]");
		
		ServerSocket serverSocket = null;
		
		try{
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("127.0.0.1",50001));
			System.out.println("���� ���...");
			Socket socket = serverSocket.accept();
			System.out.println("���� ����...");
			
			//������ ���� (Client -> Server)
			InputStream is = socket.getInputStream();
			byte[] bytes = new byte [100];
			int readBytes = is.read(bytes);
			String result = new String(bytes, 0, readBytes, "UTF-8");
			System.out.println(result);
			
			System.out.println("������ ���� �Ϸ�...");
			
			//������ �۽�(Server -> Client)
			OutputStream os = socket.getOutputStream();
			String msg = "Hello Client!";
			byte [] msgBytes = msg.getBytes();
			os.write(msgBytes);
			os.flush();
			
			System.out.println("������ �۽� �Ϸ�...");
			socket.close();
			os.close();
			is.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Server ����..");
	}
}
