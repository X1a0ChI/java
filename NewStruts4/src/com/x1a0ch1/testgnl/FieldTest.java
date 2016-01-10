package com.x1a0ch1.testgnl;

import java.util.HashMap;
import java.util.Map;

import ognl.Ognl;
import ognl.OgnlException;

import com.x1a0ch1.pojo.Foo;

public class FieldTest {
	public static void main(String[] args) throws OgnlException{
		Foo foo=new Foo();
		foo.setId(1);
		foo.setName("уехЩ");
		Map context=new HashMap();
		String name=(String)Ognl.getValue("name",context,foo);
		System.out.println("name:"+name);
		int id=(int) Ognl.getValue("id",context,foo);
		System.out.println("id:"+id);
		
	}
}
