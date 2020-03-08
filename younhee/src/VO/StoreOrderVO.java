package VO;

public class StoreOrderVO {

	private int storeNum; // 음식점 번호
	private String foodMenu; // 음식 이름
	private int quantity; // 수량
	private String clientName; // 주문자 이름
	private String clientAddress; // 주문자 주소
	private String clientHp; // 주문자 전화번호
	private int price; // 주문 가격
	
	
	public int getStoreNum() {
		return storeNum;
	}
	public void setStoreNum(int storeNum) {
		this.storeNum = storeNum;
	}
	public String getFoodMenu() {
		return foodMenu;
	}
	public void setFoodMenu(String foodMenu) {
		this.foodMenu = foodMenu;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientAddress() {
		return clientAddress;
	}
	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}
	public String getClientHp() {
		return clientHp;
	}
	public void setClientHp(String clientHp) {
		this.clientHp = clientHp;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "주문자 : " + clientName + "\n 주문자 전화번호 : " + clientHp + "\n 주문자 주소 : " + clientAddress +
				"\n───────────────────────────────\n " + foodMenu + "\t" + quantity + 
				"\n───────────────────────────────\n total\t" + price;
	}
	
	
	
	
} //class end
