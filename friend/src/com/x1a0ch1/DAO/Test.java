package com.x1a0ch1.DAO;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class Test extends UserDAOimpl {

	@org.junit.Test
	public void test() throws Exception {
//		String username="admin";
//		User user=new User();
//		UserDAOimpl dao=new UserDAOimpl();
//		user=dao.findByUsername(username);
//		System.out.println(user.getUsername()
//				+user.getName()+user.getGender()
//				+user.getAge()+user.getAsk());
//		UserDAOimpl dao=new UserDAOimpl();
//		List<User> users=dao.findAll();
//		for(User user:users){
//			System.out.println(user.getUsername()
//				+user.getName()+user.getGender()
//				+user.getAge()+user.getAsk());
//		}
		UserDAOimpl dao=new UserDAOimpl();
		User user=new User();
		user.setUsername("kn1gh7");
		user.setName("–§ÒY");
		user.setAge(24);
		user.setGender("m");
		user.setPhone("13027163971");
		user.setAsk("∫«∫«á}");
		user.setPwd("123456");
		dao.addUser(user);
		
		
	}

}
