package VO;

public class BasketVO {

	private int totalPrice = 0; // 총 가격
	private int eachPrice = 0; // 개별 가격
	private String userid; // 유저 아이디, 유저VO 키 값
	private int storeNum; // 유저 장바구니랑 점주 주문조회를 연결할 때 사용.
	private String foodName; // 유저가 담은 음식 이름.
	private int quantity; // 주문 수량.
	private String status = ""; // 주문 진행 상태.

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice += totalPrice;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public int getStoreNum() {
		return storeNum;
	}

	public void setStoreNum(int storeNum) {
		this.storeNum = storeNum;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getEachPrice() {
		return eachPrice;
	}

	public void setEachPrice(int eachPrice) {
		this.eachPrice = eachPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
