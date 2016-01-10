package com.x1a0ch1.action;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	private String username;
	private String password;
	private String repassword;
	private String name;
	private int age;
	private Date birth;
	private String email;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void validate(){
		if(username==null||"".equals(username.trim())){
			this.addFieldError("username","�û�����������");
		}else if(!Pattern.matches("\\w{6,20}",username.trim())){
			this.addFieldError("username", "�û�����������ĸ������,����Ϊ6��20֮��");
		}
		//�ж������Ƿ�����,������������жϸ�ʽ�Ƿ���ȷ
		if(password==null||"".equals(password.trim())){
			this.addFieldError("password", "�����������");
		}else if(!Pattern.matches("\\w{6,20}",password.trim())){
			this.addFieldError("password", "�����������ĸ������,����Ϊ6��20֮��");
		}
		//�ж�ȷ�������Ƿ�����,������������жϸ�ʽ�Ƿ���ȷ
		if(password==null||"".equals(repassword.trim())){
			this.addFieldError("repassword", "�����������");
		}else if(!Pattern.matches("\\w{6,20}",repassword.trim())){
			this.addFieldError("repassword", "�����������ĸ������,����Ϊ6��20֮��");
		}
		//�ж�ȷ�������Ƿ��������ͬ
		if(password!=null && repassword!=null && !repassword.equals(password)){
			this.addFieldError("repassword", "ȷ����������������ͬ");
		}
		if(name!=null && (name.length()<2 || name.length()>5)){
			this.addFieldError("name", "�����ĳ��ȱ�����2��5֮��");
		}
		
		//�ж������Ƿ�Ϸ�
		if(age<0||age>100){
			this.addFieldError("age", "��������Ч������");
		}
		//�жϳ��������Ƿ�Ϸ�
		Calendar start=Calendar.getInstance();
		Calendar end=Calendar.getInstance();
		start.set(1900, 1,1);
		end.set(2016,1,1);
		
		if(birth !=null &&(birth.after(end.getTime())||birth.before(start.getTime()))){
			this.addFieldError("birth", "��������Ч�ĳ�������");
		}
		//�ж������ַ�Ƿ�Ϸ�
		if(email!=null&& !"".equals(email) && email !="" && !Pattern.matches("[a-zA-Z][a-zA-Z0-9._-]*@([a-zA-Z0-9-_]+\\.)+(com|gov|net|com\\.cn|edu\\.cn)", email)){
			this.addFieldError("email", "��������ȷ�������ַ");
		}
	}
}
