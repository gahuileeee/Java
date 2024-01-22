package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class SelectTest {
	public static void main(String[] args) {
		//DB ����
		String host = "jdbc:mysql://127.0.0.1:3306/studydb"; //IP�ּ�, port��ȣ / ������ DB �̸�
		String user = "abc1234"; 
		String pass = "1234";
		
		//��� ó���� ����Ʈ
		List<User1> users = new ArrayList<>();
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
			String sql = "Select * from `user1`";
			stmt.executeQuery(sql);
			//5. ��� ó�� (SELECT ���)
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
			//6. ���� ����
			rs.close();
			stmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		//����Ʈ ���
		for(User1 u : users) {
			System.out.println(u);
		}
		System.out.println("���α׷� ����");
	}
}

