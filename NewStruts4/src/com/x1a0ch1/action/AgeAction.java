package com.x1a0ch1.action;

import com.opensymphony.xwork2.ActionSupport;

public class AgeAction extends ActionSupport {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public void validate(){
		if(age<0||age>100){
			this.addActionError("��������ȷ������");
		}
	}
	public String execute(){
		return "success";
	}
}
