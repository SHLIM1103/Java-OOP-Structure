package membership;
//"Menu: (1)회원가입 (2)로그인 (3)비밀번호 수정 (4)회원탈퇴 (5)아이디 중복체크 (6)마이페이지 (7)회원목록 (8)아이디검색 (9)이름검색 (10)전체 회원수 (0)종료"

public interface UserService {
	public void join(UserDTO user);
	public UserDTO login(UserDTO user);
	public void edit(UserDTO user);
	public void exitUser(UserDTO user);
	public boolean existId(String id);
	public UserDTO mypage(UserDTO user);
	public UserDTO[] userList();
	public UserDTO searchId(String id);
	public UserDTO searchName(String name);
	public int countUser();
}