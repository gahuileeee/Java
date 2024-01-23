package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedDeleteTest {
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
					String sql = "Delete from `user1` where uid=?"; //Query Parameter����
					PreparedStatement psmt =conn.prepareStatement(sql); //�����ϰ��� �ϴ� �������� ���� ��
					psmt.setString(1, "B101"); 

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
