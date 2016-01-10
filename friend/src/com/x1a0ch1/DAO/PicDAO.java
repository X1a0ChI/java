package com.x1a0ch1.DAO;

public interface PicDAO {
	public Pic findByUserid(int userid)throws Exception;
	public void addPic(Pic pic)throws Exception;
	
}
