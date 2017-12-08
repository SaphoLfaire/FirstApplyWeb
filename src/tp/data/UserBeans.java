package tp.data;

import java.util.Date;

public class UserBeans {
	private String login;
	private Date loginDate;
	
	public UserBeans (String login, Date date) {
		this.login = login;
		this.loginDate = date;
		
	}
	
	public String getLogin() {
		return login;
	}
	public Date getLoginDate() {
		return loginDate;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}

	
}
