package com.x1a0ch1.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class UserPopedom extends AbstractInterceptor {
	
	
	
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		ActionContext ctx=invocation.getInvocationContext();
		Map session=ctx.getSession();
		String login=(String) session.get("popedom");
		String result=null;
		if(login!=null && login.equals("admin")){
			result=invocation.invoke();
		}else{
			result=Action.ERROR;
		}
		return result;
	}

}
