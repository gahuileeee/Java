package sub3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionTest {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("장애를 발생하시겠습니까?");
		int answer = Integer.parseInt(br.readLine()); // 1: 장애발생
		
		//DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/bank"; //IP주소, port번호 / 접속할 DB 이름
		String user = "abc1234"; 
		String pass = "1234";
		Connection conn = null;
		try {
			//1. JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. 데이터베이스 접속
			conn=DriverManager.getConnection(host,user,pass);	
			
			//트랜잭션 시작
			conn.setAutoCommit(false);
			
			//3. SQL 실행 객체 생성
			String sql1 = "update `bank_account` set `a_balance`=`a_balance` - 1000 where `a_no`=?";
			String sql2 = "update `bank_account` set `a_balance`=`a_balance` + 1000 where `a_no`=?";
			PreparedStatement psmt1 = conn.prepareStatement(sql1);
			psmt1.setString(1, "101-11-1001");
			PreparedStatement psmt2 = conn.prepareStatement(sql2);
			psmt2.setString(1, "101-11-1003");
			
			//4. SQL 실행
			psmt1.executeUpdate();
			if(answer==1) {
				
				throw new Exception("예상치 못한 예외 발생");
			}
			psmt2.executeUpdate();
			//작업확정 -성공처리
			conn.commit();
			
			//5. 결과 처리 (SELECT 경우)
			//6. 접속 종료
			psmt1.close();
			psmt2.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
			//트랜잭션 취소 - 실패처리
			try {
				System.out.println("장애가 발생되어 rollback처리 했습니다");
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		}
		System.out.println("프로그램 종료");

	}
}
