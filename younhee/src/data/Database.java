package data;

import java.util.ArrayList;
import java.util.List;

import VO.FoodTypeVO;
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
	public List<FoodTypeVO> tb_foodType = new ArrayList<>(); // 음식종류 저장
	
	
	
	
	{
		UserVO user = new UserVO();
		user.setUserid("admin");
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
		store.setStoreName("윤희네 손맛식당");
		store.setHp("042-252-2525");
		store.setAddress("대전 서구 만년동 xx번지");
		store.setBusinessNumber("나도 잘 모름");
		store.setClosed("매주 일요일");
		store.setStoreNum(1);
		store.setDeliveryTime("30 ~ 40분");
		store.setKindOfStore(1);
		store.setFoodType("한식");
		store.setIntroduction("음식 좀 함");
		
		tb_store.add(store);
	}

	{
		StoreVO store = new StoreVO();
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
		
		tb_store.add(store);
	}
	
	{
		StoreVO store = new StoreVO();
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
		
		tb_store.add(store);
	}
	
	{
		StoreVO store = new StoreVO();
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
		
		tb_store.add(store);
	}
	
	{
		StoreVO store = new StoreVO();
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
		
		tb_store.add(store);
	}
	
	{
		StoreVO store = new StoreVO();
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
		
		tb_store.add(store);
	}
	
	{
		StoreVO store = new StoreVO();
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
		
		tb_store.add(store);
	}
}
