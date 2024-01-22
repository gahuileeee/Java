package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteTest {
	public static void main(String[] args) {
		//DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb"; //IP주소, port번호 / 접속할 DB 이름
		String user = "abc1234"; 
		String pass = "1234";
		try {
			//1. JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. 데이터베이스 접속
			Connection conn=DriverManager.getConnection(host,user,pass);	
			
			if(conn != null) {
				System.out.println("데이터베이스 접속 성공!");
			}else {
				System.out.println("데이터베이스 접속 실패!");
			}
			//3. SQL 실행 객체 생성
			Statement stmt =conn.createStatement();
			//4. SQL 실행
			String sql = "Delete from `user1` where uid ='J101'";
			stmt.executeUpdate(sql);
			//5. 결과 처리 (SELECT 경우)
			//여기서 insert 문이니 결과 처리할 것이 없음
			//6. 접속 종료
			stmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}
}
