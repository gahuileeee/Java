package sub5;

public class SQL {
	//�� Ŭ������ ��ü�� ���� �ʿ䰡 ������? �������� ������ ���ε�? �ٷ� ������ �� �ְ� �ϴ°� ȿ��
	public static final String INSERT_USER ="INSERT INTO `User2` VALUES(?,?,?,?)";
	public static final String SELECT_USERS="SELECT * FROM `User2`";
	public static final String SELECT_USER ="SELECT * FROM `User2` WHERE `uid`=?";
	public static final String UPDATE_USER ="UPDATE `user2` set "
			+ "`name`=?, `birth`=?, `addr`=? where `uid`= ?";
	public static final String DELETE_USER ="DELETE from User2 where `uid`=?";
}
