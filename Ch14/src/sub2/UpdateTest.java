package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateTest {
	public static void main(String[] args) {
		//DB ����
		String host = "jdbc:mysql://127.0.0.1:3306/studydb"; //IP�ּ�, port��ȣ / ������ DB �̸�
		String user = "abc1234"; 
		String pass = "1234";
		try {
			//1. JDBC ����̹� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. �����ͺ��̽� ����
			Connection conn=DriverManager.getConnection(host,user,pass);	
			
			if(conn != null) {
				System.out.println("�����ͺ��̽� ���� ����!");
			}else {
				System.out.println("�����ͺ��̽� ���� ����!");
			}
			//3. SQL ���� ��ü ����
			Statement stmt =conn.createStatement();
			//4. SQL ����
			String sql = "Update `user1` set hp`='010-1234-1234', `age`=40 where uid = 'P101'";
			stmt.executeUpdate(sql);
			//5. ��� ó�� (SELECT ���)
			//���⼭ insert ���̴� ��� ó���� ���� ����
			//6. ���� ����
			stmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("���α׷� ����");
	}
}
