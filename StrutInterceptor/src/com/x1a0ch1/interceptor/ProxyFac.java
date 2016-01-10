package com.x1a0ch1.interceptor;

import java.lang.reflect.Proxy;

public class ProxyFac {
	public static Object getProxy(Object user){
		MyHandler mh=new MyHandler();
		mh.setUser(user);
		return Proxy.newProxyInstance(UserImpl.class.getClassLoader(), UserImpl.class.getInterfaces(),mh);
	}
}
