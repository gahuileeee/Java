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
		System.out.println("��ָ� �߻��Ͻðڽ��ϱ�?");
		int answer = Integer.parseInt(br.readLine()); // 1: ��ֹ߻�
		
		//DB ����
		String host = "jdbc:mysql://127.0.0.1:3306/bank"; //IP�ּ�, port��ȣ / ������ DB �̸�
		String user = "abc1234"; 
		String pass = "1234";
		Connection conn = null;
		try {
			//1. JDBC ����̹� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. �����ͺ��̽� ����
			conn=DriverManager.getConnection(host,user,pass);	
			
			//Ʈ����� ����
			conn.setAutoCommit(false);
			
			//3. SQL ���� ��ü ����
			String sql1 = "update `bank_account` set `a_balance`=`a_balance` - 1000 where `a_no`=?";
			String sql2 = "update `bank_account` set `a_balance`=`a_balance` + 1000 where `a_no`=?";
			PreparedStatement psmt1 = conn.prepareStatement(sql1);
			psmt1.setString(1, "101-11-1001");
			PreparedStatement psmt2 = conn.prepareStatement(sql2);
			psmt2.setString(1, "101-11-1003");
			
			//4. SQL ����
			psmt1.executeUpdate();
			if(answer==1) {
				
				throw new Exception("����ġ ���� ���� �߻�");
			}
			psmt2.executeUpdate();
			//�۾�Ȯ�� -����ó��
			conn.commit();
			
			//5. ��� ó�� (SELECT ���)
			//6. ���� ����
			psmt1.close();
			psmt2.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
			//Ʈ����� ��� - ����ó��
			try {
				System.out.println("��ְ� �߻��Ǿ� rollbackó�� �߽��ϴ�");
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		}
		System.out.println("���α׷� ����");

	}
}
