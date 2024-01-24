package sub5;

public class SQL {
	//이 클래스를 객체로 만들 필요가 있을까? 쿼리문을 참조할 것인데? 바로 참조할 수 있게 하는게 효율
	public static final String INSERT_USER ="INSERT INTO `User2` VALUES(?,?,?,?)";
	public static final String SELECT_USERS="SELECT * FROM `User2`";
	public static final String SELECT_USER ="SELECT * FROM `User2` WHERE `uid`=?";
	public static final String UPDATE_USER ="UPDATE `user2` set "
			+ "`name`=?, `birth`=?, `addr`=? where `uid`= ?";
	public static final String DELETE_USER ="DELETE from User2 where `uid`=?";
}
