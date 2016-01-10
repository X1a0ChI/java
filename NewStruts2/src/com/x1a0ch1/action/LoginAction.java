package com.x1a0ch1.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String uname;
	private String pwd;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String execute(){
		if(uname.equals("zhangshan")&&pwd.equals("123")){
			return "success";
		}
		return "fail";
	}
}
