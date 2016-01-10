package com.x1a0ch1.interceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler {
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		Object result;
		ele.openDoor();
		result=method.invoke(user, args);
		ele.closeDoor();
		return result;
	}
	
	private Object user;
	Elevator ele=new Elevator();
	
	public void setUser(Object user){
		this.user=user;
	}

}
