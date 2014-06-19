package com.yang.bean;

import java.io.Serializable;

public class BeanInSession implements Serializable {
    private UserBean my;
    private UserBean[] online;
    private String[] mess;
    public BeanInSession() {
		// TODO Auto-generated constructor stub
	}
	public UserBean getMy() {
		return my;
	}
	public void setMy(UserBean my) {
		this.my = my;
	}
	public UserBean[] getOnline() {
		return online;
	}
	public void setOnline(UserBean[] online) {
		this.online = online;
	}
	public String[] getMess() {
		return mess;
	}
	public void setMess(String[] mess) {
		this.mess = mess;
	}
    
}
