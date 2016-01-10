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
			this.addFieldError("username","用户名必须输入");
		}else if(!Pattern.matches("\\w{6,20}",username.trim())){
			this.addFieldError("username", "用户名必须是字母和数字,长度为6到20之间");
		}
		//判断密码是否输入,如果输入了再判断格式是否正确
		if(password==null||"".equals(password.trim())){
			this.addFieldError("password", "密码必须输入");
		}else if(!Pattern.matches("\\w{6,20}",password.trim())){
			this.addFieldError("password", "密码必须是字母和数字,长度为6到20之间");
		}
		//判断确认密码是否输入,如果输入了再判断格式是否正确
		if(password==null||"".equals(repassword.trim())){
			this.addFieldError("repassword", "密码必须输入");
		}else if(!Pattern.matches("\\w{6,20}",repassword.trim())){
			this.addFieldError("repassword", "密码必须是字母和数字,长度为6到20之间");
		}
		//判断确认密码是否和密码相同
		if(password!=null && repassword!=null && !repassword.equals(password)){
			this.addFieldError("repassword", "确认密码和密码必须相同");
		}
		if(name!=null && (name.length()<2 || name.length()>5)){
			this.addFieldError("name", "姓名的长度必须在2到5之间");
		}
		
		//判断年龄是否合法
		if(age<0||age>100){
			this.addFieldError("age", "请输入有效的年龄");
		}
		//判断出生日期是否合法
		Calendar start=Calendar.getInstance();
		Calendar end=Calendar.getInstance();
		start.set(1900, 1,1);
		end.set(2016,1,1);
		
		if(birth !=null &&(birth.after(end.getTime())||birth.before(start.getTime()))){
			this.addFieldError("birth", "请输入有效的出生日期");
		}
		//判断邮箱地址是否合法
		if(email!=null&& !"".equals(email) && email !="" && !Pattern.matches("[a-zA-Z][a-zA-Z0-9._-]*@([a-zA-Z0-9-_]+\\.)+(com|gov|net|com\\.cn|edu\\.cn)", email)){
			this.addFieldError("email", "请输入正确的邮箱地址");
		}
	}
}
