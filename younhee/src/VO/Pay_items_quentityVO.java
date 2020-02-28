package VO;

public class Pay_items_quentityVO {

	private String userid; // 유저 아이디
	private int foodNum; // 음식 번호
	private int quantity; // 수량

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public int getFoodNum() {
		return foodNum;
	}

	public void setFoodNum(int foodNum) {
		this.foodNum = foodNum;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
