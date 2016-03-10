package bean;

public class User {
	private long userId;
	private String userName;

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + "]";
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
