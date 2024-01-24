package sub5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// Data Access Object
// Data Access Object (데이터베이스 CRUD 처리 객체)
public class UserDAO {
	//싱클톤
	private static UserDAO instance = new UserDAO();
	public static UserDAO getInstance() {
		return instance;
	}
	private UserDAO() {	}
	
	//DB 정보 (고정상수 문자열로 변하지 않음)
	private final  String HOST = "jdbc:mysql://127.0.0.1:3306/studydb"; 
	private final  String USER = "abc1234"; 
	private final  String PASS = "1234";
	
	// DB 자원
	private Connection conn =null;
	private Statement stmt =null;
	private PreparedStatement psmt =null;
	private ResultSet rs =null;
	
	// 커넥션 생성
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		//1단계
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2단계
		return DriverManager.getConnection(HOST,USER,PASS);
	}
	
	//자원해제 메서드
	private void close() throws SQLException {
		if(rs != null) {
			rs.close();
		}
		if(stmt != null) {
			stmt.close();
		}
		if(psmt != null) {
			psmt.close();
		}
		if(conn != null) {
			conn.close();
		}
	}
	// CRUD method
	public void insertUser(UserDTO user) {
		try {
			conn=getConnection();
			psmt=conn.prepareStatement(SQL.INSERT_USER);
			psmt.setString(1, user.getUid());
			psmt.setString(2, user.getName());
			psmt.setString(3, user.getBirth());
			psmt.setString(4, user.getAddr());
			psmt.executeUpdate();
			close();
		}catch(Exception e) {
			
		}
	}
	public List<UserDTO> selectUsers() {
		try {
			conn=getConnection();
			stmt=conn.createStatement();
			rs = stmt.executeQuery(SQL.SELECT_USERS);
			List<UserDTO> users = new ArrayList<>();
			while(rs.next()) {
				UserDTO user = new UserDTO();
				user.setUid(rs.getString(1));
				user.setName(rs.getString(2));
				user.setBirth(rs.getString(3));
				user.setAddr(rs.getString(4));
				users.add(user);
			}
			close();
			return users;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public UserDTO selectUser(String uid) {
		try {
			conn=getConnection();
		psmt=conn.prepareStatement(SQL.SELECT_USER);
		psmt.setString(1, uid);
		rs =psmt.executeQuery();
		UserDTO user = null; 
		if(rs.next()) {
			user = new UserDTO();
			user.setUid(rs.getString(1));
			user.setName(rs.getString(2));
			user.setBirth(rs.getString(3));
			user.setAddr(rs.getString(4));
		}
		close();
		return user;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public void updateUser(UserDTO user) {
		try {
			conn=getConnection();
			psmt = conn.prepareStatement(SQL.UPDATE_USER);
			psmt.setString(1, user.getName());
			psmt.setString(2, user.getBirth());
			psmt.setString(3, user.getAddr());
			psmt.setString(4, user.getUid());
			psmt.executeUpdate();
			close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void deleteUser(String uid) {
		try {
			conn=getConnection();
			psmt= conn.prepareStatement(SQL.DELETE_USER);
			psmt.setString(1, uid);
			psmt.executeUpdate();
			close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
