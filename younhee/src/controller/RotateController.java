package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import VO.MenuVO;
import VO.StoreVO;
import service.StoreService;
import service.UserService;

public class RotateController {
	
	UserService userService = UserService.getInstance();
	StoreService storeService = StoreService.getInstance();
	
	
	public void foodMenuController(ArrayList<StoreVO> store) { // 유저가 선택한 음식 종류를 전문으로 하는 음식점 리스트가 매개변수
		Scanner s = new Scanner(System.in);
		
		System.out.println("---------------------------");
		System.out.println("음식점을 선택해주세요.");
		System.out.println("---------------------------");
		
		int choice = Integer.parseInt(s.nextLine());
		
		userService.showFoodMenu(choice, store); // 유저가 선택한 음식점과 선택 전의 분야별로 정리된 음식점 리스트를 인자로 전달.
		
		}
	
	
	
	public void choiceMenuController(List<MenuVO> selectedMenu, ArrayList<StoreVO> store, int choicedStoreNum) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("1.장바구니에 담기  2.주문하기  3.돌아가기");
		int choice = 0;
		choice = Integer.parseInt(s.nextLine());
		
		boolean flag = true;
		while(flag) {
			switch(choice) {
			case 1 :
				storeService.putIntoBasket(selectedMenu, store, choicedStoreNum); // 선택된 메뉴 리스트를 인자로 전달.
				flag = false;
				break;
			case 2 :
				storeService.showBasketInfo();
				flag = false;
			case 3 :
				Controller control = new Controller();
				control.userController();
				flag = false;
				break;
			default :
				System.out.println("유효하지 않은 선택입니다.");
			}
		}
	}



	public void orderController() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("1.결제하기   2.주문취소");
		int choice = Integer.parseInt(s.nextLine());
		switch(choice) {
		case 1 :
			System.out.println("현재 장바구니에 들어있는 음식을 주문합니다.\n결제하시겠습니까?");
			storeService.order();
			break;
		case 2 :
			// 주문취소 메소드
			break;
		default :
			System.out.println("유효하지 않은 선택입니다.");
		}
	
		
	}
	
	
} // class end

