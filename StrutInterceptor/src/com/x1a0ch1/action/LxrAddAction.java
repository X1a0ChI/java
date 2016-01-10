package com.x1a0ch1.action;

import java.util.regex.Pattern;

import com.opensymphony.xwork2.ActionSupport;

public class LxrAddAction extends ActionSupport {
	private String name;
	private int age;
	private String phone;
	private String email;
	private String homePage;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHomePage() {
		return homePage;
	}
	public void setHomePage(String homePage) {
		this.homePage = homePage;
	}
	public void validate(){
		if(name==null || "".equals(name.trim())){
			this.addFieldError("name", "������������");
		}else if(name.length()<2||name.length()>5){
			this.addFieldError("name", "�������ȱ�����2��5֮��");
		}
		if(age<0||age>100){
			this.addFieldError("age", "��������Ч������");
		}
		if(phone!=null && !"".equals(phone.trim())&&!Pattern.matches("\\d{11,12}",phone.trim())){
			this.addFieldError("phone","��������Ч����ϵ�绰");
		}
		if(email!=null && !"".equals(email.trim())&& email!="" &&
				!Pattern.matches("[a-zA-Z][a-zA-Z0-9._-]*@([a-zA-Z0-9-_]+\\.)+(com|gov|net|com\\.cn|edu\\.cn)", email)){
				this.addFieldError("email", "��������ȷ�������ַ");	
				}
	}
	public String execute(){
		return "success";
	}
}
