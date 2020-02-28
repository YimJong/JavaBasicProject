package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import VO.StoreVO;
import VO.UserVO;
import controller.Controller;
import dao.UserDao;
import data.Session;

public class UserService {

	private static UserService instance;

	private UserService() {
	}

	public static UserService getInstance() {
		if (instance == null) {
			instance = new UserService();
		} 
		return instance;
	}

	UserDao userDao = new UserDao();
	
	
	
	public void createUser() {  // 계정 생성
		Scanner s = new Scanner(System.in);
		
		String id = null;
		UserVO idCheck = null;
		do {
			System.out.println("아이디 :");
			id = s.nextLine();

			HashMap<String, String> param = new HashMap<>();
			param.put("ID", id);
			idCheck = userDao.selectUser(param);

			if (idCheck != null) { // 로그인 할 때 사용하는 메소드이므로 null이 아니면 아이디가 있다는 의미
				System.out.println("사용할 수 없는 아이디 입니다.");
			}
		} while (idCheck != null);  // null 이면 

		System.out.println("비밀번호 : ");
		String password = s.nextLine();
		System.out.println("이름 : ");
		String name = s.nextLine();

		UserVO user = new UserVO();

		user.setUserid(id);
		user.setPassword(password);
		user.setUserName(name);

		userDao.insertUser(user);
		System.out.println("가입해주셔서 감사합니다.");

	}
	
	
	public void userLogin() {
		Scanner s = new Scanner(System.in);
		
		String id = null;
		String password = null;
		boolean isCheck = true;
		
		do {
		System.out.println("아이디를 입력하세요. : ");
		id = s.nextLine();
		System.out.println("비밀번호를 입력하세요. : ");
		password = s.nextLine();
		
		UserVO isVaild = userDao.loginCheckID(id, password);	
		
		if(isVaild == null) {
			System.out.println("아이디 또는 비밀번호가 옳바르지 않습니다.\n다시 입력하세요.");
		} else {
			System.out.println(isVaild.getUserName() + "님 환영합니다!");
			Session.CurrentLoginUser = isVaild;
			isCheck = false;
			Controller ct = new Controller();
			ct.userController();
		}
			
		} while(isCheck);
		
		
		
	} // method end
	
	
	
	
	public void showResturant(int choice) {
		
		ArrayList<StoreVO> store = userDao.checkResturantChoice(choice); // 입력받은 번호의 점포가 저장됨.
		
		for(int i = 0; i < store.size(); i++){
			System.out.println(store.get(i).getStoreName());
			System.out.println(store.get(i).getFoodType());
			System.out.println(store.get(i).getMinimumOrder());
			System.out.println(store.get(i).getDeliveryTime());
			
		}
		
		
	}
	
	
	
	
	
	
} // end class
