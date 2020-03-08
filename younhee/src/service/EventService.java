package service;

import java.util.Scanner;

import controller.Controller;
import dao.EventDao;

public class EventService {
	
	private static EventService instance;
	
	private EventService() {}
	
	public static EventService getInstance() {
		if(instance == null) {
			instance = new EventService();
		}	return instance;
	}
	
	EventDao eventDao = new EventDao();
	

	public void showCurrentEvent() {
		Scanner s = new Scanner(System.in);
		System.out.println("========================");
		System.out.println("1.가위바위보  2.제비뽑기  3.돌아가기");
		System.out.println("========================");
		
		int choice = Integer.parseInt(s.nextLine());
		boolean flag = true;
		while(flag) {
			switch(choice) {
			case 1 :
				// 가위바위보 게임 메소드 (이벤트찬스 횟수 조회 후 게임 메소드 실행 가능 유무 체크)
				flag = false;
				break;
			case 2 :
				// 제비뽑기 메소드
				flag = false;
				break;
			case 3 :
				Controller ct = new Controller();
				ct.userController();
			default :
				System.out.println("유효하지 않은 선택입니다.");
				
			}
		}
	}
	
	
	
	
} // class end
