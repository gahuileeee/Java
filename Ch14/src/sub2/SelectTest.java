package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class SelectTest {
	public static void main(String[] args) {
		//DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb"; //IP주소, port번호 / 접속할 DB 이름
		String user = "abc1234"; 
		String pass = "1234";
		
		//결과 처리용 리스트
		List<User1> users = new ArrayList<>();
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
			String sql = "Select * from `user1`";
			stmt.executeQuery(sql);
			//5. 결과 처리 (SELECT 경우)
			ResultSet rs = stmt.getResultSet();
			while(rs.next()) {
				String uid = rs.getString(1);
				String name = rs.getString(2);
				String birth = rs.getString(3);
				String hp = rs.getString(4);
				int age = rs.getInt(5);
				
				User1 u1 = new User1();
				u1.setUid(uid);
				u1.setName(name);
				u1.setBirth(birth);
				u1.setHp(hp);
				u1.setAge(age);
				users.add(u1);
				//users.add(new User1(rs.getString(1),rs.getString(2), rs.getString(3),
				//rs.getString(4),Integer.parseInt(rs.getString(5))));
			}
			//6. 접속 종료
			rs.close();
			stmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		//리스트 출력
		for(User1 u : users) {
			System.out.println(u);
		}
		System.out.println("프로그램 종료");
	}
}

