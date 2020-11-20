package membership;

public class UserController {
	private UserService userService;
	
	public UserController() {
		userService = new UserServiceImpl();
	}
	
	public void postJoin(UserDTO user) {
		userService.join(user);
	}

	public UserDTO postLogin(UserDTO user) {
		return userService.login(user); 
	}

	public void putEditPassword(UserDTO user) {
		userService.edit(user);
	}

	public void deleteExitUser(UserDTO user) {
		userService.exitUser(user);
	}

	public boolean getExistId(String id) {
		return userService.existId(id);
	}

	public UserDTO getMypage(UserDTO user) {
		return userService.mypage(user);
	}

	public UserDTO[] getUserList() {
		return userService.userList();
	}

	public UserDTO getSearchId(String id) {
		return userService.searchId(id);
	}

	public UserDTO getSearchName(String name) {
		return userService.searchName(name);
	}

	public int getCountUser() {
		return userService.countUser();
	}

}
