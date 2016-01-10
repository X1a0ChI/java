package com.x1a0ch1.action;

import com.opensymphony.xwork2.ActionSupport;

public class TransferAction extends ActionSupport {
	private String param;

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}
	public String execute() throws Exception{
		return "success";
	}
}
