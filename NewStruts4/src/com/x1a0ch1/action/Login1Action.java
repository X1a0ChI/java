package com.x1a0ch1.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Login1Action extends ActionSupport implements Action,
		ModelDriven<User> {
	private User user=new User();
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	public String execute(){
		return "success";
	}

}
