/**
 * 
 */
package com.x1a0ch1.testgnl;

import java.util.HashMap;
import java.util.Map;

import ognl.Ognl;
import ognl.OgnlException;

import com.x1a0ch1.pojo.Foo;

/**
 * @author Administrator
 *
 */
public class MethodTest {

	/**
	 * @param args
	 * @throws OgnlException 
	 */
	public static void main(String[] args) throws OgnlException {
		Foo foo=new Foo();
		Map context=new HashMap();
		Ognl.getValue("setName('ÍõÎå')", context,foo);
		Ognl.getValue("setId(2)",context,foo);
		String name=(String) Ognl.getValue("getName()", context,foo);
		int id=(Integer) Ognl.getValue("getId()",context,foo);
		System.out.println("name:"+name);
		System.out.println("id:" + id);
	}

}
