package com.x1a0ch1.action;

import com.opensymphony.xwork2.ActionSupport;

public class PointAction extends ActionSupport {
	private Point point;

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}
	public String execute(){
		return "success";
	}
}
