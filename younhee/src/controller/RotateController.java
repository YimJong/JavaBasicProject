package controller;

import java.util.ArrayList;
import java.util.Scanner;

import VO.StoreVO;
import service.UserService;

public class RotateController {
	
	UserService userService = UserService.getInstance();
	
	public void foodMenuController(ArrayList<StoreVO> store) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("---------------------------");
		System.out.println("음식점을 선택해주세요.");
		System.out.println("---------------------------");
		
		int choice = Integer.parseInt(s.nextLine());
		
		userService.showFoodMenu(choice, store); // 유저가 선택한 음식점과 선택전의 분야별로 정리된 음식점 리스트를 인자로 전달.
		
		
		
	
		}
	
	
	
	
	
	
} // class end

