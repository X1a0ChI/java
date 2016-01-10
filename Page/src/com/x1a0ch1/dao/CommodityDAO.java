package com.x1a0ch1.dao;

import java.util.List;

import com.x1a0ch1.commodity.Commodity;

public interface CommodityDAO {
	public void addCommodity(Commodity commodity);
	public void updateCommodity(Commodity commodity);
	public void deleteCommodity(int commodityId);
	public List<Commodity> findAllCommodity();
	public Commodity findbyCommodityById(int commodityId);
}
