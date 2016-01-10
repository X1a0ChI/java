package com.x1a0ch1.action;

import com.opensymphony.xwork2.ActionSupport;

public class ShowMessageAction extends ActionSupport {
	private String showMessage;

	public String getShowMessage() {
		return showMessage;
	}

	public void setShowMessage(String showMessage) {
		this.showMessage = showMessage;
	}
	public String execute(){
		showMessage=this.getText("ActionMessage");
		return "success";
	}
}
