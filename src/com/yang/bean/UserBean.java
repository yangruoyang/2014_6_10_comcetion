package com.yang.bean;

import java.io.Serializable;

public class UserBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private String email;
	private String sex;
	private String pic;
	private boolean isonline;
	public UserBean() {
		// TODO Auto-generated constructor stub
	}
	public UserBean(String name, String email, String sex, String pic,
			boolean isonline) {
		super();
		this.name = name;
		this.email = email;
		this.sex = sex;
		this.pic = pic;
		this.isonline = isonline;
	}

	public boolean isIsonline() {
		return isonline;
	}
	public void setIsonline(boolean isonline) {
		this.isonline = isonline;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	
  
}
