package com.x1a0ch1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.x1a0ch1.DBUtil.DBConnection;
import com.x1a0ch1.commodity.Commodity;

public class CommodityDAOImpl implements CommodityDAO {

	@Override
	public void addCommodity(Commodity commodity) {
		Connection conn=DBConnection.getConnection();
		String addSQL="insert into commodity(commodityName,price,agio) values(?,?,?)";
		PreparedStatement pstmt=null;
		try {
			pstmt=conn.prepareStatement(addSQL);
			pstmt.setString(1, commodity.getCommodityName());
			pstmt.setDouble(2, commodity.getPrice());
			pstmt.setDouble(3, commodity.getAgio());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBConnection.close(pstmt);
			DBConnection.close(conn);
		}
	}

	@Override
	public void updateCommodity(Commodity commodity) {
		Connection conn=DBConnection.getConnection();
		String updateSQL="update commodity set commodityName=?,set price=?,set agio=?¡¡where id=?";
		PreparedStatement pstmt=null;
		try {
			pstmt=conn.prepareStatement(updateSQL);
			pstmt.setString(1, commodity.getCommodityName());
			pstmt.setDouble(2, commodity.getPrice());
			pstmt.setDouble(3, commodity.getAgio());
			pstmt.setInt(4, commodity.getCommodityId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBConnection.close(pstmt);
			DBConnection.close(conn);
		}
	}

	@Override
	public void deleteCommodity(int commodityId) {
			Connection conn=DBConnection.getConnection();
			String deleteSQL="delect *¡¡from commodity where id=?";
			PreparedStatement pstmt=null;
			try {
				pstmt=conn.prepareStatement(deleteSQL);
				pstmt.setInt(1, commodityId);
				pstmt.execute();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				DBConnection.close(pstmt);
				DBConnection.close(conn);
			}
			
			
	}

	@Override
	public List<Commodity> findAllCommodity() {
		Connection conn=DBConnection.getConnection();
		String updateSQL="select * from commodity";
		PreparedStatement pstmt=null;
		List<Commodity> commodityList=new ArrayList<Commodity>();
		try {
			pstmt=conn.prepareStatement(updateSQL);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				Commodity commodity=new Commodity();
				commodity.setCommodityId(rs.getInt(1));
				commodity.setCommodityName(rs.getString(2));
				commodity.setPrice(rs.getDouble(3));
				commodity.setAgio(rs.getDouble(4));
				commodityList.add(commodity);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBConnection.close(pstmt);
			DBConnection.close(conn);
		}
		
		return commodityList;
	}
	@Override
	public Commodity findbyCommodityById(int commodityId) {
		Connection conn=DBConnection.getConnection();
		String updateSQL="select * from commodity where id=?";
		PreparedStatement pstmt=null;
		Commodity commodity=new Commodity();
		
		try {
			pstmt=conn.prepareStatement(updateSQL);
			pstmt.setInt(1, commodityId);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				commodity.setCommodityId(rs.getInt(1));
				commodity.setCommodityName(rs.getString(2));
				commodity.setPrice(rs.getDouble(3));
				commodity.setAgio(rs.getDouble(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBConnection.close(pstmt);
			DBConnection.close(conn);
		}
		
		return commodity;
	}

}
