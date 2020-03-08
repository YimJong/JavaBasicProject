package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import VO.BasketVO;
import VO.MenuVO;
import VO.StoreOrderVO;
import VO.StoreVO;
import controller.Controller;
import controller.RotateController;
import data.Database;
import data.Session;

public class StoreService {

	private static StoreService instance;
	
	private StoreService() {}
	
	public static StoreService getInstance() {
		if(instance == null) {
			instance = new StoreService();
		}	return instance;
	}

	Database database = Database.getInstance();
	
	public void putIntoBasket(List<MenuVO> selectedMenu, ArrayList<StoreVO> store, int choicedStoreNum) {  // 선택 된 음식점의 메뉴 리스트를 매개변수로 받음.
		Scanner s = new Scanner(System.in);
		BasketVO basket = new BasketVO();
		basket.setUserid(Session.CurrentLoginUser.getUserid()); // 현재 로그인 유저 아이디
		
		System.out.println("장바구니에 담을 메뉴 번호를 입력하세요.");
		int choice = Integer.parseInt(s.nextLine());
		basket.setStoreNum(selectedMenu.get(choice - 1).getStoreNum()); // 담은 메뉴의 음식점 번호를 저장
		basket.setFoodName(selectedMenu.get(choice - 1).getFoodName()); // 담은 메뉴의 이름 저장.
		System.out.println("주문 수량을 입력하세요.");
		int quantity = 1;
		do {
		quantity = Integer.parseInt(s.nextLine());
		if(quantity < 0) System.out.println("기본 주문 수량은 1개 이상이여야 합니다.");
		} while(quantity < 0);
		basket.setQuantity(quantity); // 주문 수량 저장.
		
		basket.setTotalPrice(selectedMenu.get(choice - 1).getPrice()* quantity); // 총 주문 금액에 선택한 메뉴의 가격을 더함.
		basket.setEachPrice(selectedMenu.get(choice - 1).getPrice() * quantity); // 개별 주문 금액을 저장.
		
		System.out.println("선택하신 음식은 " + selectedMenu.get(choice - 1).getFoodName() + " " + 
							quantity + "개 입니다.\n장바구니에 담으시겠습니까?");
		System.out.println("1.네  2.아니오");
		choice = Integer.parseInt(s.nextLine());
		
		if(choice == 1) {
			database.tb_basket.add(basket); // 장바구니에 담음.
			System.out.println("장바구니에 담았습니다!\n");
			UserService.getInstance().showFoodMenu(choicedStoreNum, store); // 메뉴가 나오는 화면으로 돌아가기
		} else if(choice == 2) {
			Controller ct = new Controller(); 
			ct.userController();
		} else {
			System.out.println("유효하지 않은 선택입니다.");
		}
		
		
		} // method end

	
	
	public void showBasketInfo() {
		Scanner s = new Scanner(System.in);
		System.out.println("<나의 장바구니>");
		for(BasketVO basket : database.tb_basket) { // 유저 아이디를 키값으로 유저 아이디의 장바구니 정보를 출력.
			if(Session.CurrentLoginUser.getUserid().equals(basket.getUserid())) {
				System.out.println(basket.getFoodName() + " " + basket.getQuantity() + "개 --- " +
								   basket.getEachPrice() + " " + basket.getStatus());
			}
		}
		
		System.out.println("──────────────────────────────");
		
		int totalPrice = 0;
		for(BasketVO basket : database.tb_basket) {  // 총 가격 출력을 위해 위의 for문 한번 더 이용.
			if(Session.CurrentLoginUser.getUserid().equals(basket.getUserid())) {
				totalPrice += basket.getTotalPrice();
			}
		}
		System.out.println("주문 총 가격 : " + totalPrice);
		RotateController rc = new RotateController();
		rc.orderController();
		
		
	}

	public void order() {
		System.out.println("1.네  2.아니오");
		Scanner s = new Scanner(System.in); // 주문 확인을 위한 스캐너
		int choice = Integer.parseInt(s.nextLine());
		StoreVO tmpStore = null;
		BasketVO tmpBasket = null;
		
		switch(choice) {  // 1.결제  2.결제 안함
		case 1 :
			for(BasketVO basket : database.tb_basket) {
				StoreOrderVO order = new StoreOrderVO();
				if(basket.getUserid().equals(Session.CurrentLoginUser.getUserid())) { // 주문자의 장바구니 객체를 가져옴.
					tmpBasket = basket;
					
					order.setStoreNum(tmpBasket.getStoreNum());
					order.setFoodMenu(tmpBasket.getFoodName());
					order.setQuantity(tmpBasket.getQuantity());
					order.setPrice(tmpBasket.getTotalPrice());
				}
				order.setClientName(Session.CurrentLoginUser.getUserName());
				order.setClientAddress(Session.CurrentLoginUser.getAddress());
				order.setClientHp(Session.CurrentLoginUser.getHp());
				
				database.tb_order.add(order);
			}
			System.out.println("주문이 완료되었습니다. 예상 배달 소요시간은 " + database.tb_store.get(tmpBasket.getStoreNum() - 1).getDeliveryTime() + "입니다.");
			break;
		case 2 :
			
		}
		
	}
		
	
	
	
	
	
	
	
	
} // class end
