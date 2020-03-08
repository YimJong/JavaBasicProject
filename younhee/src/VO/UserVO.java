package VO;

public class UserVO {

	private String userName;// 유저이름
	private String password;// 유저비밀번호
	private String userid;// 유저 아이디
	private String gender;// 유저 성별
	private int point = 0;// 유저 포인트
	private int grade;// 회원가입 대상 체크
	private String hp;// 전화번호
	private String address;// 유저 주소
	private String nickName;// 유저 닉네임
	private int eventChance = 0;// 이벤트 참여 기회

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
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

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getEventChance() {
		return eventChance;
	}

	public void setEventChance(int eventChance) {
		this.eventChance = eventChance;
	}

	@Override
	public String toString() {
		return "UserVO [userName=" + userName + ", password=" + password + ", userid=" + userid + ", gender=" + gender
				+ ", point=" + point + ", grade=" + grade + ", hp=" + hp + ", address=" + address + ", nickName="
				+ nickName + ", eventChance=" + eventChance + "]";
	}



}
