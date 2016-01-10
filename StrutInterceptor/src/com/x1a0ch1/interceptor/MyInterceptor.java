package com.x1a0ch1.interceptor;


public class MyInterceptor {

	public static void main(String[] args) {
		User user=new UserImpl();
		User proxyUser=(User) ProxyFac.getProxy(user);
		proxyUser.up();
	}

}
