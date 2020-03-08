package controller;

import java.util.Scanner;

import dao.CouponDao;
import data.Database;
import service.CouponService;
import service.EventService;
import service.UserService;

public class Controller {

	public static void main(String[] args) {
		new Controller().start();
	}
	
	
	
	UserService userService = UserService.getInstance();
	EventService eventService = EventService.getInstance();
	
	private void start() {
		CouponDao couponDao = new CouponDao(); // 시간에 따른 이벤트 코인 자동 충전 (Runnable run 메소드가 있는 클래스)
		CouponService couponService = new CouponService(); 	
		couponService.chargeEventChance(couponDao, 16, 23, 20); // 시간 발표 시간 상황에 따라 직접 입력할 것!
													
		Scanner s = new Scanner(System.in);

		int menu;

		do {
			System.out.println("---------------------------");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("0. 프로그램 종료");
			System.out.println("---------------------------");

			menu = Integer.parseInt(s.nextLine());  // 유저 입력값을 받아 저장하는 변수

			switch (menu) {
			case 1: // 로그인 
				userService.userLogin();
				break;
			case 2: // 회원가입
				userService.createUser();
				break;
			case 0: 
				System.out.println("프로그램 종료");
				break;
			case 4 : // 유저 가입 정보 확인용 임시 테스트..
				userService.showUserTest();
				break;
			default :
				System.out.println("<유효하지 않은 번호 선택입니다.>\n");
			}

		} while (menu != 0);
	}

	
	
	
	
	public void userController() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("---------------------------");
		System.out.println("1.한식  2.중식  3.일식\n4.양식  5.분식  6.패스트푸드  7.디저트\n8.공지사항    9.이벤트    0.로그아웃");
		System.out.println("---------------------------");
		
		int choice = Integer.parseInt(s.nextLine());
		
		switch(choice) {
		case 1 : case 2: case 3: case 4: case 5: case 6: case 7:
			userService.showResturant(choice);
			break;
		case 8 : 
			// 공지사항 관련 메소드
			
		case 9 : 
			eventService.showCurrentEvent();
			break;
		case 0 : 
			// 로그아웃
			break;
		case 11 :
			System.out.println(Database.getInstance().tb_order);
			userController();
		}
	}
	
	
	
}
