package sub1;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * ��¥: 2024-01-22
 * �̸�: �̰���
 * ����: JDBC �ǽ�
 */
public class JDBCTest {

	public static void main(String[] args) {
		
		//DB ����
		String host = "jdbc:mysql://127.0.0.1:3306/studydb"; //IP�ּ�, port��ȣ / ������ DB �̸�
		String user = "abc1234"; 
		String pass = "1234";
		
		
		try {
			//JDBC ����̹� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		// �����ͺ��̽� ����
		Connection conn=DriverManager.getConnection(host,user,pass);	
		
		if(conn != null) {
			System.out.println("�����ͺ��̽� ���� ����!");
		}else {
			System.out.println("�����ͺ��̽� ���� ����!");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("���α׷� ����");
	
	}
}
