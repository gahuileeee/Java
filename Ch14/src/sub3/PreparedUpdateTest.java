package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedUpdateTest {
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
					
					//3. SQL ���� ��ü ���� �� ����
					String sql = "Update `User1` set hp=?, age=? where uid=?"; //Query Parameter����
					PreparedStatement psmt =conn.prepareStatement(sql); //�����ϰ��� �ϴ� �������� ���� ��
					psmt.setString(1, "010-1234-1005"); 
					psmt.setString(2, "35"); 
					psmt.setString(3, "B101"); 
//					psmt.setString(4, "010-1234-5678"); 
//					psmt.setInt(5, 24); //��Ʈ���� (age���� �ش�) 
//					
					//4. SQL ����
					psmt.executeUpdate();
					
					//5. ��� ó�� (SELECT ���)
					//6. ���� ����
					psmt.close();
					conn.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
				System.out.println("���α׷� ����");
	}
}
