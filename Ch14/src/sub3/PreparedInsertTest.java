package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparedInsertTest {
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
					String sql = "INSERT INTO `User1` Values (?,?,?,?,?)"; //Query Parameter����
					PreparedStatement psmt =conn.prepareStatement(sql); //�����ϰ��� �ϴ� �������� ���� ��
					psmt.setString(1, "B101"); 
					psmt.setString(2, "��ö��"); 
					psmt.setString(3, "01-03-15"); 
					psmt.setString(4, "010-1234-5678"); 
					psmt.setInt(5, 24); //��Ʈ���� (age���� �ش�) 
					
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
