package com.myshop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHelper {
	//DB정보
	private final  String HOST = "jdbc:mysql://127.0.0.1:3306/shop"; 
	private final  String USER = "abc1234"; 
	private final  String PASS = "1234";
	
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(HOST,USER,PASS);
	}
	//DB자원
	protected Connection conn = null;
	protected Statement stmt = null;
	protected PreparedStatement psmt =null;
	protected ResultSet rs =null;
	
	public void close() throws SQLException {
		if(rs != null) {
			rs.close();
		}
		if(stmt !=null) {
			stmt.close();
		}
		if(psmt != null) {
			psmt.close();
		}
		if(conn != null) {
			conn.close();
		}
	}
}
