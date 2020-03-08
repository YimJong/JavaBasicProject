package dao;

import VO.UserVO;
import data.Database;

public class CouponDao implements Runnable{

	@Override
	public void run() {
		Database database = Database.getInstance();
		System.out.println("<<오늘의 이벤트 코인이 충전되었습니다.>>");
		for(int i = 0; i < database.tb_user.size(); i++) {
			UserVO user = database.tb_user.get(i);
			
			if(user.getEventChance() == 0) {
				user.setEventChance(1);
			} 
		}
		
	}

	
	
}
