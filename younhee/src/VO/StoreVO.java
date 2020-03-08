package VO;

public class StoreVO {

	private String storeName;// 가게이름
	private String hp;// 전화번호
	private String address;// 주소
	private String businessNumber;// 사업자번호
	private String deliveryTime;// 배달시간
	private String closed;// 휴무일
	private String introduction;// 가게 소개
	private int minimumOrder;// 최소주문금액
	private int storeNum;// 가게번호
	private int kindOfStore; // 특정 음식 전문점 구분
	private String foodType; // 한글 전문점 구분
	private int salesAmount; // 매출액

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBusinessNumber() {
		return businessNumber;
	}

	public void setBusinessNumber(String businessNumber) {
		this.businessNumber = businessNumber;
	}

	public String getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public String getClosed() {
		return closed;
	}

	public void setClosed(String closed) {
		this.closed = closed;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public int getMinimumOrder() {
		return minimumOrder;
	}

	public void setMinimumOrder(int minimumOrder) {
		this.minimumOrder = minimumOrder;
	}

	public int getStoreNum() {
		return storeNum;
	}

	public void setStoreNum(int storeNum) {
		this.storeNum = storeNum;
	}

	public void setKindOfStore(int kindOfStore) {
		this.kindOfStore = kindOfStore;
	}

	public int getKindOfStore() {
		return kindOfStore;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getSalesAmount() {
		return salesAmount;
	}

	public void setSalesAmount(int salesAmount) {
		this.salesAmount += salesAmount;
	}

}
