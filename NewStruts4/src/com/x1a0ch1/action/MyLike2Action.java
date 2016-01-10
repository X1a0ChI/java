package com.x1a0ch1.action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

public class MyLike2Action extends ActionSupport {
	private ArrayList<String> mylike;

	public ArrayList<String> getMylike() {
		return mylike;
	}

	public void setMylike(ArrayList<String> mylike) {
		this.mylike = mylike;
	}
	public String execute(){
		return "success";
	}
}
