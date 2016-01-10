package com.x1a0ch1.action;

import java.lang.reflect.Member;
import java.util.Map;

import ognl.OgnlOps;
import ognl.TypeConverter;

public class DefaultTypeConverter implements TypeConverter {
	public DefaultTypeConverter(){
		super();
	}	
	public Object convertValue(Map context,Object value, Class toType){
		return OgnlOps.convertValue(value,toType);
	}
	@Override
	public Object convertValue(Map context,Object target, Member member, String propertyName,
			Object value, Class toType) {
		// TODO Auto-generated method stub
		return convertValue(context,value,toType);
	}

}
