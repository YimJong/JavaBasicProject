package data;

import java.util.ArrayList;
import java.util.List;

import VO.BasketVO;
import VO.FoodTypeVO;
import VO.MenuVO;
import VO.StoreOrderVO;
import VO.StoreVO;
import VO.UserVO;

public class Database {

	private static Database instance;

	private Database() {}

	public static Database getInstance() {
		if (instance == null) {
			instance = new Database();
		}
		return instance;
	}
	
	public List<UserVO> tb_user = new ArrayList<>(); // 유저 정보를 저장하기 위한 리스트
	public List<StoreVO> tb_store = new ArrayList<>(); // 점포 정보를 저장하기 위한 리스트
	public List<FoodTypeVO> tb_foodType = new ArrayList<>(); // 음식종류 데이터
	public List<MenuVO> tb_menu = new ArrayList<>(); // 메뉴 데이터
	public List<BasketVO> tb_basket = new ArrayList<>(); // 장바구니 데이터
	public List<StoreOrderVO> tb_order = new ArrayList<>(); // 매장별 주문 데이터
	
	
	
	{
		UserVO user = new UserVO();
		user.setUserid("admin");
		user.setNickName("관리자");
		user.setUserName("관리자");
		user.setPassword("0000");
		user.setPoint(999999);
		user.setAddress("대전 어디든지");
		user.setGender("불명");
		user.setGrade(0);
		user.setHp("010-0000-0000");
		
		tb_user.add(user);
	}
	
	

	
	
	
	{
		FoodTypeVO foodTypeVO = new FoodTypeVO();
		String[] kindOfFood = new String[]{"한식", "중식", "일식", "양식", "분식", "패스트푸드", "디저트"};
		
		for(int i = 0; i < kindOfFood.length; i++) {
			foodTypeVO.setFoodName(kindOfFood[i]);
			foodTypeVO.setFoodTypeNum(i + 1);
			tb_foodType.add(foodTypeVO);
		}
	}
	
	
	
	
	
	{
		StoreVO store = new StoreVO();
		MenuVO menu = new MenuVO();
		MenuVO menu2 = new MenuVO();
		
		store.setStoreName("윤희네 손맛식당"); // 스캐너
		store.setHp("042-252-2525"); // 스캐너
		store.setAddress("대전 서구 만년동 xx번지");  // 스캐너 구 다섯가지/ 회원가입처럼
		store.setBusinessNumber("나도 잘 모름"); // 스캐너
		store.setClosed("매주 일요일"); // 스캐너
		store.setStoreNum(1); // 스캐너 아님. StoreNum++
		store.setDeliveryTime("30 ~ 40분"); // 스캐너
		store.setKindOfStore(1); // 스캐너
		store.setFoodType("한식"); // 스캐너?
		store.setIntroduction("음식 좀 함"); // 스캐너
		store.setMinimumOrder(10000); // 스캐너
		
		menu.setFoodName("육회비빔밥"); // 스캐너
		menu.setFoodNum(1); // ++
		menu.setPrice(8000); // 스캐너
		menu.setStoreNum(1); // 
		menu.setDetail("쉪 윤희가 직접 보고 고른 A+ 한우로 만든 육회가 들어간 비빔밥."); // 스캐너
		
		menu2.setFoodName("돌솥비빔밥");
		menu2.setFoodNum(2);
		menu2.setPrice(5000);
		menu2.setStoreNum(1);
		menu2.setDetail("쉪 윤희가 직접 빚은 돌솥에 담은 비빔밥.");
		tb_store.add(store);
		tb_menu.add(menu);
		tb_menu.add(menu2);
		
	}

	{
		StoreVO store = new StoreVO();
		MenuVO menu = new MenuVO();
		
		store.setStoreName("윤희네 불맛식당");
		store.setHp("042-245-6125");
		store.setAddress("대전 대덕구 송촌동 xx번지");
		store.setBusinessNumber("나도 잘 모른다고");
		store.setClosed("매주 월요일");
		store.setStoreNum(2);
		store.setDeliveryTime("15 ~ 25분");
		store.setKindOfStore(2);
		store.setFoodType("중식");
		store.setIntroduction("음식 좀 함");
		store.setMinimumOrder(10000);
		
		menu.setFoodName("짜장면");
		menu.setFoodNum(1);
		menu.setPrice(5000);
		menu.setStoreNum(2);
		menu.setDetail("쉪 윤희가 직접 뽑은 수타면으로 만든 짜장면");
		tb_store.add(store);
		tb_menu.add(menu);
	}
	
	{
		StoreVO store = new StoreVO();
		MenuVO menu = new MenuVO();
		store.setStoreName("윤희네 칼맛식당");
		store.setHp("041-245-6125");
		store.setAddress("대전 대덕구 비래동 xx번지");
		store.setBusinessNumber("나도 잘 모른다고");
		store.setClosed("공휴일");
		store.setStoreNum(3);
		store.setDeliveryTime("30 ~ 40분");
		store.setKindOfStore(3);
		store.setFoodType("일식");
		store.setIntroduction("음식 좀 함");
		store.setMinimumOrder(10000);
		
		menu.setFoodName("셰프 오마카셰(디너)");
		menu.setFoodNum(1);
		menu.setPrice(130000);
		menu.setStoreNum(3);
		menu.setDetail("오늘의 싱싱한 해산물로 직접 쥐어주는 디너 초밥 오마카셰");
		tb_store.add(store);
		tb_menu.add(menu);
	}
	
	{
		StoreVO store = new StoreVO();
		MenuVO menu = new MenuVO();
		store.setStoreName("윤희네 레스토랑");
		store.setHp("043-225-6126");
		store.setAddress("대전 대덕구 비래동 xx번지");
		store.setBusinessNumber("나도 잘 모른다고");
		store.setClosed("가끔쉼");
		store.setStoreNum(4);
		store.setDeliveryTime("30 ~ 40분");
		store.setKindOfStore(4);
		store.setFoodType("양식");
		store.setIntroduction("음식 좀 함");
		store.setMinimumOrder(10000);
		
		menu.setFoodName("스테이크");
		menu.setFoodNum(1);
		menu.setPrice(25000);
		menu.setStoreNum(4);
		menu.setDetail("쉪 윤희가 직접 도축하고 구워주는 한우 스테이크");
		
		tb_store.add(store);
		tb_menu.add(menu);
	}
	
	{
		StoreVO store = new StoreVO();
		MenuVO menu = new MenuVO();
		store.setStoreName("윤희네 분식");
		store.setHp("041-245-6125");
		store.setAddress("대전 대덕구 비래동 xx번지");
		store.setBusinessNumber("나도 잘 모른다고");
		store.setClosed("공휴일");
		store.setStoreNum(5);
		store.setDeliveryTime("10 ~ 20분");
		store.setKindOfStore(5);
		store.setFoodType("분식");
		store.setIntroduction("음식 좀 함");
		store.setMinimumOrder(10000);
		
		menu.setFoodName("떡복이");
		menu.setFoodNum(1);
		menu.setPrice(3000);
		menu.setStoreNum(5);
		menu.setDetail("쉪 윤희가 직접 뽑은 쌀떡으로 만든 떡볶이.");
		tb_store.add(store);
		tb_menu.add(menu);
	}
	
	{
		StoreVO store = new StoreVO();
		MenuVO menu = new MenuVO();
		store.setStoreName("윤희's터치 버거");
		store.setHp("041-245-6125");
		store.setAddress("대전 대덕구 비래동 xx번지");
		store.setBusinessNumber("나도 잘 모른다고");
		store.setClosed("무휴");
		store.setStoreNum(6);
		store.setDeliveryTime("15 ~ 25분");
		store.setKindOfStore(6);
		store.setFoodType("패스트푸드");
		store.setIntroduction("음식 좀 함");
		store.setMinimumOrder(10000);
		
		menu.setFoodName("윤희버거");
		menu.setFoodNum(1);
		menu.setPrice(5000);
		menu.setStoreNum(6);
		menu.setDetail("쉪 윤희의 시그니쳐 버거");
		
		tb_store.add(store);
		tb_menu.add(menu);
	}
	
	{
		StoreVO store = new StoreVO();
		MenuVO menu = new MenuVO();
		store.setStoreName("윤희네 카페");
		store.setHp("041-245-1125");
		store.setAddress("대전 대덕구 비래동 xx번지");
		store.setBusinessNumber("나도 잘 모른다고");
		store.setClosed("공휴일");
		store.setStoreNum(7);
		store.setDeliveryTime("5 ~ 15분");
		store.setKindOfStore(7);
		store.setFoodType("디저트");
		store.setIntroduction("음식 좀 함");
		store.setMinimumOrder(8000);
		
		menu.setFoodName("망고쥬스");
		menu.setFoodNum(1);
		menu.setPrice(4000);
		menu.setStoreNum(7);
		menu.setDetail("점주 윤희가 직접 기르는 망고로 만든 망고쥬스");
		
		tb_store.add(store);
		tb_menu.add(menu);
	}
}
