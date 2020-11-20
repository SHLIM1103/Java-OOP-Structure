package view;

import java.util.Scanner;
import membership.UserController;
import membership.UserDTO;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UserDTO user = null;
		UserController userController = new UserController();

		while (true) {
			System.out.println(
					"Menu: (1)회원가입 (2)로그인 (3)비밀번호 수정 (4)회원탈퇴 (5)아이디 중복체크 (6)마이페이지 (7)회원목록 (8)아이디검색 (9)이름검색 (10)전체 회원수 (0)종료");
			switch (scanner.next()) {
			case "1":
				System.out.println("---(1)회원가입---");
				System.out.println("아이디, 비밀번호, 이름 입력: ");
				user = new UserDTO();
				user.setUserId(scanner.next());
				user.setPassword(scanner.next());
				user.setName(scanner.next());
				userController.postJoin(user);
				break;
			case "2":
				System.out.println("---(2)로그인---");
				System.out.println("아이디, 비밀번호 입력: ");
				user = new UserDTO();
				user.setUserId(scanner.next());
				user.setPassword(scanner.next());
				UserDTO loginUser = userController.postLogin(user);
				if(loginUser == null) {
					System.out.println("로그인 실패");
				}else {
					System.out.println(loginUser.toString());
				}
				break;
			case "3":
				System.out.println("---(3)비밀번호 수정---");
				System.out.println("아이디, 수정할 비밀번호 입력: ");
				user.setUserId(scanner.next());
				user.setPassword(scanner.next());
				userController.putEditPassword(user);
				break;
			case "4":
				System.out.println("---(4)회원탈퇴---");
				System.out.println("아이디, 비밀번호 입력: ");
				user.setUserId(scanner.next());
				user.setPassword(scanner.next());
				userController.deleteExitUser(user);
				break;
			case "5":
				System.out.println("---(5)아이디 중복체크---");
				System.out.println("아이디: ");
				boolean exist = userController.getExistId(scanner.next());
				if(exist) {
					System.out.println("사용 가능한 아이디입니다.");
				}else {
					System.out.println("이미 사용 중인 아이디입니다.");
				}
				break;
			case "6":
				System.out.println("---(6)마이페이지---");
				System.out.println("아이디, 비밀번호: ");
				user.setUserId(scanner.next());
				user.setPassword(scanner.next());
				UserDTO mypage = userController.getMypage(user);
				System.out.println(mypage);
				break;
			case "7":
				System.out.println("---(7)회원목록---");
				UserDTO[] list = userController.getUserList();
				for(int i = 0 ; i < userController.getCountUser(); i++) {
					System.out.println(list[i].toString());
				}
				break;
			case "8":
				System.out.println("---(8)아이디 검색---");
				System.out.println("아이디: ");
				UserDTO idSearch = userController.getSearchId(scanner.next());
				break;
			case "9":
				System.out.println("---(9)회원이름 검색---");
				System.out.println("검색할 회원 이름: ");
				UserDTO nameSearch = userController.getSearchName(scanner.next());
				break;
			case "10":
				System.out.println("---(10)전체 회원수---");
				System.out.printf("전체 회원수: %s명\n", userController.getCountUser());
				break;
			case "0":
				System.out.println("---시스템 종료---");
				return;
			}
		}
	}
}
