package VO;

public class MenuVO {

	private String foodName; // 음식명
	private int price; // 가격
	private String detail; // 음식설명
	private int storeNum; // 가게번호
	private int foodNum; // 음식번호

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String datail) {
		this.detail = datail;
	}

	public int getStoreNum() {
		return storeNum;
	}

	public void setStoreNum(int storeNum) {
		this.storeNum = storeNum;
	}

	public int getFoodNum() {
		return foodNum;
	}

	public void setFoodNum(int foodNum) {
		this.foodNum = foodNum;
	}

	@Override
	public String toString() {
		return foodNum + " -" + foodName + "-\n가격 : " + price + "원\n" + detail + "\n";
	}

	
}
