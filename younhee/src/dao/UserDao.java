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
	
	
	
	public UserVO selectNickName(String nick) {
		UserVO rtnUser = null;
		
		for(int i = 0; i < database.tb_user.size(); i++) {
			if(nick.equals(database.tb_user.get(i).getNickName())) {
				rtnUser = database.tb_user.get(i);  // 같은 닉네임이 있으면 그 유저를 rtnUser에 대입.
				break;
			}
		}
		return rtnUser; // 같은 닉네임이 있으면 이미 대입된 유저객체를 리턴, 같은 닉네임이 없으면 null을 리턴.
	}
	
	
	
	
	public UserVO loginCheckID(String id, String password) {
		UserVO rtnUser = null;
		
		for(int i = 0; i < database.tb_user.size(); i++) {
			UserVO user = database.tb_user.get(i);
			boolean flag = false;
			
			if(id.equals(user.getUserid()) == true && password.equals(user.getPassword()) == true) {
				flag = true;
			}
		
			if(flag) rtnUser = user;  // 아이디와 비밀번호가 같다면 flag가  true이고 그 같은 유저 객체를 rtnUser에 대입.
		} 
		return rtnUser; // 같다면 이미 대입된 객체를, 다르다면 null 값을 리턴.
	}
	
	
	
	

	public void insertUser(UserVO user) {				// 입력 받은 값으로 데이터베이스에 저장.
		database.tb_user.add(user);
	}

	
	
	public ArrayList<StoreVO> checkResturantChoice(int choice) {  // 유저가 선택한 음식종류와 일치하는 점포를 리스트에 저장하는 메소드
		ArrayList<StoreVO> selectedStore = new ArrayList<>();
		for(int i = 0; i < database.tb_store.size(); i++) {
			if(database.tb_store.get(i).getKindOfStore() == choice) {  // 유저가 선택한 번호와 점포가 다루는 음식 키 값의 일치 비교
				StoreVO store = database.tb_store.get(i);     // 같으면 store 값에 점포 객체 저장
				selectedStore.add(store);     // 저장된 store를 리스트에 추가.
			}
		}
		
		return selectedStore;  // 분류된 점포 저장한 리스트를 리턴.
	}
	
	
	
} //end class
