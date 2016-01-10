package com.x1a0ch1.action;

import java.lang.reflect.Member;
import java.util.Map;
import com.x1a0ch1.action.*;
import ognl.OgnlOps;

public class PointConverter extends DefaultTypeConverter {
	public Object convertValue(Map context,Object value, Class toType){
		if(Point.class==toType){
			String[] paramStrs=(String[])value;
			String[] pointArray=paramStrs[0].split(",");
			Point point=new Point();
			point.setX(Integer.parseInt(pointArray[0]));
			point.setY(Integer.parseInt(pointArray[1]));
			return point;
			
		}
		if(String.class==toType){
			Point point=(Point) value;
			int x=point.getX();
			int y=point.getY();
			StringBuilder sb=new StringBuilder();
			sb.append("x坐标为").append(x).append(",y坐标为").append("y");
			return sb.toString();
		}
		return null;
	}

}
