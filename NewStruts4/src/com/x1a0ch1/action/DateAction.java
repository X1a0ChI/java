package com.x1a0ch1.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class DateAction extends ActionSupport {
	private Date mybirth;
	private Long age;
	public Date getMybirth() {
		return mybirth;
	}
	public void setMybirth(Date mybirth) {
		this.mybirth = mybirth;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	public String execute(){
		Date now=new Date();
		long nowTime=now.getTime();
		long birthTime=mybirth.getTime();
		long difference=nowTime-birthTime;
		long differenceDay=difference/(1000*60*60*24);
		age=differenceDay/365+1;
		return "success";
	}
}
