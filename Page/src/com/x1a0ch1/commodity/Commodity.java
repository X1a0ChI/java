package com.x1a0ch1.commodity;

public class Commodity {
	private int commodityId;
	private String commodityName;
	private double price;
	private double agio;
	public String getCommodityName() {
		return commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getAgio() {
		return agio;
	}
	public void setAgio(double agio) {
		this.agio = agio;
	}
	public int getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(int commodityId) {
		this.commodityId = commodityId;
	}
	
	
}
