package dao;

import java.util.ArrayList;
import java.util.HashMap;

import VO.StoreVO;
import VO.UserVO;
import data.Database;

public class UserDao {

	Database database = Database.getInstance();

	public UserVO selectUser(HashMap<String, String> param) {             // 회원 가입 시 아이디 중복 방지용 메소드
		UserVO rtnUser = null;											  // 로그인 시에는 아디기 비밀번호가 일치하는지에서 사용

		for (int i = 0; i < database.tb_user.size(); i++) {
			UserVO user = database.tb_user.get(i);

			boolean flag = true;
			for (String key : param.keySet()) {
				String value = param.get(key);
				if (key.equals("ID")) {
					if (!user.getUserid().equals(value)) {
						flag = false;
					} else if (key.equals("PASSWORD")) {
						if (!user.getPassword().equals(value)) {
							flag = false;
						} else if (key.equals("NAME")) {
							flag = false;
						}

					}
				}
			}
			if(flag) rtnUser = user;
		}
		return rtnUser;
	}
	
	
	
	
	
	
	public UserVO loginCheckID(String id, String password) {
		UserVO rtnUser = null;
		
		for(int i = 0; i < database.tb_user.size(); i++) {
			UserVO user = database.tb_user.get(i);
			
			boolean flag = false;
			for(UserVO info : database.tb_user) {
				
				if(id.equals(info.getUserid()) == true && password.equals(info.getPassword()) == true) {
					flag = true;
				} 
			} if(flag) rtnUser = user;
		} 
		return rtnUser;
	}
	
	
	
	

	public void insertUser(UserVO user) {				// 입력 받은 값으로 데이터베이스에 저장.
		database.tb_user.add(user);
	}

	
	
	public ArrayList<StoreVO> checkResturantChoice(int choice) {
		ArrayList<StoreVO> selectedStore = new ArrayList<>();
		for(int i = 0; i < database.tb_store.size(); i++) {
			if(database.tb_store.get(i).getKindOfStore() == choice) {
				StoreVO store = database.tb_store.get(i);
				selectedStore.add(store);
			}
		}
		
		return selectedStore;
	}
	
	
	
} //end class
