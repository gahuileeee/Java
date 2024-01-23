package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PreparedSelectTest {
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
					String sql = "Select * from `User4`";
					PreparedStatement psmt = conn.prepareStatement(sql);
					//4. SQL ����
					ResultSet rs= psmt.executeQuery();
					
					//5. ��� ó�� (SELECT ���)
					List<String> list = new ArrayList<>();
					while(rs.next()){
						list.add(rs.getString(1));
						list.add(rs.getString(2));
						list.add(rs.getString(3));
						list.add(rs.getString(4));
						list.add(rs.getString(5));
						list.add(rs.getString(6));
					}
					//6. ���� ����
					rs.close();
					psmt.close();
					conn.close();
					int i=0;
					for(String a: list) {
						i++;
						System.out.print(a+" ");
						if(i==6) {
							System.out.println();
							i=0;
						}
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
				
				System.out.println("\n���α׷� ����");
	}
}
