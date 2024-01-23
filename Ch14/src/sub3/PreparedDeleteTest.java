package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedDeleteTest {
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
					
					//3. SQL 실행 객체 생성 및 맵핑
					String sql = "Delete from `user1` where uid=?"; //Query Parameter형식
					PreparedStatement psmt =conn.prepareStatement(sql); //수행하고자 하는 쿼리문이 들어가야 함
					psmt.setString(1, "B101"); 

					//4. SQL 실행
					psmt.executeUpdate();
					
					//5. 결과 처리 (SELECT 경우)
					//6. 접속 종료
					psmt.close();
					conn.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
				System.out.println("프로그램 종료");
	}
}
