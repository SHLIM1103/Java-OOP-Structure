package membership;

public interface UserDAO {
	public void insertUser(UserDTO user);
	public UserDTO login(UserDTO user);
	public void updateUser(UserDTO user);
	public void deleteUSer(UserDTO user);
	public boolean selectExistId(String id);
	public UserDTO selectUser(UserDTO user);
	public UserDTO[] selectUserList();
	public UserDTO selectById(String id);
	public UserDTO selectByName(String name);
	public int selectCount();
}
