package com.x1a0ch1.DAO;

import java.util.List;

public interface UserDAO {
	public List<User> findAll()throws Exception;
	public User findByUsername(String username)throws Exception;
	public void addUser(User user)throws Exception;
	public User findById(int id)throws Exception;
}
