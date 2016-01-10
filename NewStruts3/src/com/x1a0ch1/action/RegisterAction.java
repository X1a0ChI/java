package com.x1a0ch1.action;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	private String uname;
	private String upassword;
	private String repassword;
	private String name;
	private String age;
	private String birth;
	private String email;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void validate(){
		if(upassword==null || "".equals(upassword)){
			this.addActionError("密码必须输入");
		}
		if(repassword==null|| "".equals(repassword)){
			this.addActionError("确认密码必须输入");
		}
		if(upassword!=null&&repassword!=null&&!repassword.equals(upassword)){
			this.addActionError("密码和确认密码必须相同");
		}
	}
	public String execute(){
		return "success";
	}
	
}
