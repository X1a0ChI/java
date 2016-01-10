package com.x1a0ch1.action;

import com.opensymphony.xwork2.ActionSupport;

public class MyLikeAction extends ActionSupport {
	private String[] mylike;

	public String[] getMylike() {
		return mylike;
	}

	public void setMylike(String[] mylike) {
		this.mylike = mylike;
	}
	
	public String execute(){
		return "success";
	}
	
}
