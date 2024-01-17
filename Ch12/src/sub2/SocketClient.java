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
			System.out.println("연결 요청...");
			socket.connect(new InetSocketAddress("127.0.0.1", 50001));
			// clinet의 ip 주소와 연결 할 port 번호 설정 여기서 127.0.0.1은 Loopback으로 요청을 Server에게 하지만 다시 자기에게로 요청이 돌아감.
			// 따라서 자기 자신이 Client이자 Server가 됨 =localhost
			System.out.println("연결 성공...");
			
			// 데이터 송신 (Client -> Server)
			OutputStream os = socket.getOutputStream();
			String msg = "Hello Server!";
			byte [] msgBytes = msg.getBytes();
			os.write(msgBytes);
			os.flush();
			
			System.out.println("데이터 송신 완료...");
			
			//데이터 수신 (Server-> Client )
			InputStream is = socket.getInputStream();
			byte[] bytes = new byte [100];
			int readBytes = is.read(bytes);
			String result = new String(bytes, 0, readBytes, "UTF-8");
			System.out.println(result);
			
			System.out.println("데이터 수신 완료...");
			
			os.close();
			is.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		//Socket 종료
		if(!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("client 종료...");
	}
}
