package com.x1a0ch1.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.x1a0ch1.util.DBUtil;

public class UserDAOimpl implements UserDAO {

	@Override
	public List<User> findAll() throws Exception {
		List<User> users=new ArrayList<User>();
		Connection conn=DBUtil.getConnection();
		Statement stat=conn.createStatement();
		ResultSet rst=stat.executeQuery("select * from f_user");
		while(rst.next()){
			User user=new User();
			user.setId(rst.getInt("id"));
			user.setUsername(rst.getString("username"));
			user.setName(rst.getString("name"));
			user.setAge(rst.getInt("age"));
			user.setGender(rst.getString("gender"));
			user.setPhone(rst.getString("phone"));
			user.setAsk(rst.getString("ask"));
			user.setPwd(rst.getString("pwd"));
			users.add(user);
		}
		DBUtil.close(conn);
		return users;		
	}

	@Override
	public User findByUsername(String username) throws Exception {
		User user=null;
		Connection conn=DBUtil.getConnection();
		PreparedStatement prep=conn.prepareStatement("select * from f_user where username=?");
		prep.setString(1,username);
		ResultSet rst=prep.executeQuery();
		if(rst.next()){
			user=new User();
			user.setId(rst.getInt("id"));
			user.setUsername(username);
			user.setName(rst.getString("name"));
			user.setAge(rst.getInt("age"));
			user.setGender(rst.getString("gender"));
			user.setPhone(rst.getString("phone"));
			user.setAsk(rst.getString("ask"));
			user.setPwd(rst.getString("pwd"));
		}
		DBUtil.close(conn);
		return user;
	}

	@Override
	public void addUser(User user) throws Exception {
		Connection conn=DBUtil.getConnection();
		PreparedStatement prep=conn.prepareStatement("insert into"
				+ " f_user(username,pwd,name,age,gender,phone,ask) values('"+user.getUsername()+"'"
						+ ",'"+user.getPwd()+"','"+user.getName()+"','"+user.getAge()+"','"+user.getGender()+"','"
								+user.getPhone()+ "','"+user.getAsk()+"')");
		
		prep.execute();
		DBUtil.close(conn);
	}

	@Override
	public User findById(int id) throws Exception {
		Connection conn=DBUtil.getConnection();
		User user=null;
		PreparedStatement prep=conn.prepareStatement("select * from f_user where id=?");
		prep.setInt(1, id);
		ResultSet rst=prep.executeQuery();
		if(rst.next()){
			user=new User();
			user.setId(rst.getInt("id"));
			user.setUsername(rst.getString("username"));
			user.setName(rst.getString("name"));
			user.setAge(rst.getInt("age"));
			user.setGender(rst.getString("gender"));
			user.setPhone(rst.getString("phone"));
			user.setAsk(rst.getString("ask"));
			user.setPwd(rst.getString("pwd"));
		}
		return user;
	}

}
