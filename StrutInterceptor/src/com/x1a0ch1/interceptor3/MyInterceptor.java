package com.x1a0ch1.interceptor3;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor extends AbstractInterceptor {
	private	String interceptorName;
	
	
	
	public void setInterceptorName(String interceptorName) {
		this.interceptorName = interceptorName;
	}



	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println(interceptorName+":拦截操作前");
		String result=invocation.invoke();
		System.out.println(interceptorName+":拦截操作后");
		return result;
	}

}
