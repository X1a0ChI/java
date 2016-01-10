package com.x1a0ch1.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.x1a0ch1.util.DBUtil;

public class PicDAOimpl implements PicDAO {

	@Override
	public Pic findByUserid(int userid) throws Exception {
		Pic pic=null;
		Connection conn=DBUtil.getConnection();
		PreparedStatement prep=conn.prepareStatement("select * from"
				+ " f_pic where userID=?");
		prep.setInt(1, userid);
		ResultSet rst=prep.executeQuery();
		while(rst.next()){
			pic=new Pic();
			pic.setId(rst.getInt("id"));
			pic.setPicName(rst.getString("picName"));
			pic.setUserid(userid);
		}
		return pic;
	}

	@Override
	public void addPic(Pic pic) throws Exception {
		Connection conn=DBUtil.getConnection();
		PreparedStatement prep=conn.prepareStatement("insert into"
				+ " f_pic(picName,userID) values('"+pic.getPicName()+"','"
						+ pic.getUserid()+"')");
		prep.execute();
		DBUtil.close(conn);
		
	}

}
