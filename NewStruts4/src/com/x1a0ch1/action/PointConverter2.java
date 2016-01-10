package com.x1a0ch1.action;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

public class PointConverter2 extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		String[] pointArray=values[0].split(",");
		Point point=new Point();
		point.setX(Integer.parseInt(pointArray[0]));
		point.setY(Integer.parseInt(pointArray[1]));
		return point;
	}

	@Override
	public String convertToString(Map context, Object o) {
		Point point=(Point) o;
		int x=point.getX();
		int y=point.getY();
		StringBuilder sb=new StringBuilder();
		sb.append("x坐标为:").append("x").append(",y的坐标为:").append("y");
		return sb.toString();
	}

}
