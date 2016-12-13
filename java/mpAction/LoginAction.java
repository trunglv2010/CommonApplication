package mpAction;

import com.opensymphony.xwork2.ActionSupport;

import mpBean.UserBean;

public class LoginAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private UserBean userBean;
	
	
	public UserBean getUserBean() {
		return userBean;
	}


	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}


	public String execute(){
			return SUCCESS;
	}
	
}
